package ksmart41_teamtest.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.service.ServiceManagementService;
import ksmart41_teamtest.service.ServicePaymentService;
import ksmart41_teamtest.service.ServiceRequestService;

@Controller
@RequestMapping("/shop/service/serviceRequest")
public class ShopServiceRequestController {
   
   private static final Logger log = LoggerFactory.getLogger(ShopServiceRequestController.class);
   // 계약요청 관련 의존성 주입
   private ServiceManagementService serviceManagementService;
   private ServiceRequestService serviceRequestService;
   private ServicePaymentService servicePaymentService;
   
   public ShopServiceRequestController(ServiceRequestService serviceRequestService , ServiceManagementService serviceManagementService
		   								,ServicePaymentService servicePaymentService) {
      this.serviceRequestService = serviceRequestService;
      this.serviceManagementService = serviceManagementService;
      this.servicePaymentService = servicePaymentService;
   }
   
   // client /  계약요청 등록
   @GetMapping("/addServiceRequest")
   public String addServiceRequest(Model model) {
      List<ServiceManagement> serviceManagement = serviceManagementService.getServiceManagement();
      // 서비스 정보 가져오기
      model.addAttribute("serviceManagement",serviceManagement);
      model.addAttribute("title","계약요청 등록");
      return "shop/service/serviceRequest/addServiceRequest";
   }
   @PostMapping("/addServiceRequest")
   public String addServiceRequest(ServiceRequest serviceRequest) {
      log.info("ShopServiceRequestController 계약요청 등록 화면에서 입력받은 값 :{}" + serviceRequest);
      serviceRequestService.addServiceRequest(serviceRequest);

      return "redirect:/shop/service/serviceRequest/selectServiceRequest";
   }
   // client / 계약요청 등록 /  내 사업장별 대표코드 조회하기 modal
   @PostMapping("/findMyMainBizCode")
   @ResponseBody
   public List<Map<String, Object>> findMyMainBizCode(String shopMemberId){
      List<Map<String, Object>> myMainBizCode = serviceRequestService.findMyMainBizCode(shopMemberId);
      log.info("PostMapping 계약요청 등록 - 내 사업장별 대표코드 조회 결과 :{}" , myMainBizCode);
      return myMainBizCode;
   }
   // 계약요청 조회 - 승인 시 결제하기
   @GetMapping("/addPayment")
   public String addPayment(Model model, ServicePayment paymentCode) {
	   model.addAttribute("title","결제하기");
	   ServicePayment getRequestInfo = servicePaymentService.getRequestInfo(paymentCode);
	   model.addAttribute("getRequestInfo", getRequestInfo);
	   return "shop/service/serviceRequest/addPayment";
   }
   @PostMapping("/addPayment")
   public String addPayment(ServicePayment servicePayment) {
	   log.info("서비스 결제 ==========={}:" , servicePayment);
			   servicePaymentService.addPayment(servicePayment);
	   return "redirect:/shop/service/serviceRequest/selectServiceRequest";
   }

// client 본인 계약요청 조회
   @GetMapping("/selectServiceRequest") 
     public String getRequestList(Model model, HttpSession session) { 
      String SHOPID = (String) session.getAttribute("SHOPID");
      //로그인한 쇼핑몰 Id 세션값
      List<ServiceRequest> getRequestList = serviceRequestService.getRequestList();
      model.addAttribute("title", "계약요청 개인조회"); 
      model.addAttribute("getRequestList", getRequestList);

      return "shop/service/serviceRequest/selectServiceRequest"; 
     }
   // client 계약요청 수정 ( 개발사에서 승인 , 취소 전에 수정 가능)
   @PostMapping("/modifyServiceRequest")
   public String modifyServiceRequest(ServiceRequest serviceRequest) {
      log.info("PostMapping 계약요청 수정 페이지 입력 받은 값 ======== {}:",serviceRequest);
      
      serviceRequestService.modifyServiceRequest(serviceRequest);
      
      return "redirect:/shop/service/serviceRequest/selectServiceRequest";
   }
   @GetMapping("/modifyServiceRequest")
   public String modifyServiceRequest(@RequestParam(value="contractManageCode", required = false) String contractManageCode
                              ,Model model) {
      log.info("GetMapping 계약요청 수정페이지 contractManageCode ====== {}: " , contractManageCode);
      model.addAttribute("title","계약요청 수정");
      model.addAttribute("serviceInfo", serviceManagementService.getServiceManagement());
      
      if(contractManageCode != null && !"".equals(contractManageCode)) {
         ServiceRequest getContractInfo = serviceRequestService.getContractInfo(contractManageCode);
         model.addAttribute("getContractInfo",getContractInfo);
      }
      return "shop/service/serviceRequest/modifyServiceRequest";
   }
   // Client 계약요청 삭제 ( 관리자 승인 전 가능 )
   @RequestMapping("/deleteServiceRequest")
   public @ResponseBody int deleteServiceRequest(ServiceRequest ServiceRequest) {
      log.info("계약요청 삭제 페이지 입력 받은 값 ======== {}:");
      return serviceRequestService.deleteServiceRequest(ServiceRequest);
   }
   
   
}