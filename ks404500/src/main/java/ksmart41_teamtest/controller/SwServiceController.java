package ksmart41_teamtest.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.dto.PaymentState;
import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.service.ServiceRequestService;
import ksmart41_teamtest.service.ServiceManagementService;
import ksmart41_teamtest.service.ServicePaymentService;

@Controller
@RequestMapping("/sw/service")
public class SwServiceController {
	
	private static final Logger log = LoggerFactory.getLogger(SwServiceController.class);
	
	@Autowired
	private ServiceRequestService serviceRequestService;
	private ServiceManagementService serviceManagementSerivce;
	private ServicePaymentService servicePaymentService;
	
	
	public SwServiceController(ServiceRequestService serviceRequestService, ServiceManagementService serviceManagementSerivce, 
								ServicePaymentService servicePaymentService) {
		this.serviceRequestService = serviceRequestService;
		this.serviceManagementSerivce = serviceManagementSerivce;
		this.servicePaymentService = servicePaymentService;
	}
	// sw - 계약요청 / sw서비스 / 계약요청 등록
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		
		return "sw/service/serviceRequest/addServiceRequest";
	}
	// sw - 계약요청 등록 / client 내 사업장별 대표코드 조회하기 modal
	@PostMapping("/findMyMainBizCode")
	@ResponseBody
	public List<Map<String, Object>> findMyMainBizCode(){
		List<Map<String, Object>> myMainBizCode = serviceRequestService.findMyMainBizCode();
		log.info("PostMapping 계약요청 등록 - 내 사업장별 대표코드 조회 결과 :{}" , myMainBizCode);
		return myMainBizCode;
	}
	// 계약요청 수정 페이지
	@GetMapping("/serviceRequest/modifyServiceRequest")
	public String modifyServiceRequest(Model model) {
		
		return "sw/service/serviceRequest/modifyServiceRequest";
	}
	// 계약요청 삭제 페이지
	@GetMapping("/serviceRequest/deleteServiceRequest")
	public String deleteServiceRequest(Model model) {
		
		return "sw/service/serviceRequest/deleteServiceRequest";
	}
	
	// sw - client 본인 계약요청 전체 조회
	@GetMapping("/serviceRequest/selectServiceRequest") 
	  public String getRequestList(Model model) { 
	  List<ServiceRequest> getRequestList = serviceRequestService.getRequestList();
	  model.addAttribute("title", "계약요청 개인조회"); 
	  model.addAttribute("getRequestList", getRequestList);

	  return "sw/service/serviceRequest/selectServiceRequest"; 
	  }
	
	// 서비스 결제예정 관리 =================================================
	
	// 서비스 결제 예정 조회 (sw 개발사)
	@GetMapping("/servicePaymentSum")
	public String getServicePaymentSum(Model model) {
		List<ServicePayment> getServicePaymentSum = servicePaymentService.getServicePaymentSum();
		model.addAttribute("title","계약요청 - 결제예정 조회");
		model.addAttribute("getServicePaymentSum",getServicePaymentSum);
		return "sw/service/servicePaymentSum";
	}
	// 서비스 결제예정 확인 테이블 (sw 개발사)
	@PostMapping("/servicePaymentCheck")
		public String servicePaymentCheck(String paymentCode) {
		
		servicePaymentService.servicePaymentCheck(paymentCode);
		
		return "redirect:/servicePaymentCheck";
	}
	@GetMapping("/servicePaymentCheck")
	public String servicePaymentCheck (@RequestParam(value="paymentCode", required=false) String paymentCode,
											Model model) {
		
		ServicePayment servicePaymentCheck = servicePaymentService.servicePaymentCheck(paymentCode);
		model.addAttribute("title","서비스 결제확인");
		model.addAttribute("servicePaymentCheck",servicePaymentCheck);
		model.addAttribute("PaymentStateCode",servicePaymentService.getPaymentStateCode());
		
		return "sw/service/servicePaymentCheck";
	}
	
	// 서비스 결제예정 확인 -> 결제예정 결제상태 업데이트
	@PostMapping("/modifyPaymentState")
	public String modifyPaymentState(@RequestParam(value="servicePaymentCheck" , required = false) String paymentStateCode
									,@RequestParam(value="paymentCode" , required = false) String paymentCode) {
		log.info("서비스 결제정보 코드  {} : " + paymentCode);
		log.info("서비스 결제 상태  코드  {} : " + paymentStateCode);
		servicePaymentService.modifyPaymentStateCode(paymentCode,paymentStateCode);
		return "redirect:/sw/service/servicePaymentSum";
	}
	
	// /서비스 결제예정 관리 =================================================================
	
	// 계약요청 전체 조회 (sw개발사)
	@GetMapping("/serviceRequest/selectAllServiceRequest") 
	  public String getAllRequestList(Model model) { 
	  List<ServiceRequest> getAllRequestList = serviceRequestService.getAllRequestList();
	  model.addAttribute("title", "회원전체조회"); 
	  model.addAttribute("getAllRequestList", getAllRequestList);

	  return "sw/service/serviceRequest/selectAllServiceRequest"; 
	  }
	

	
	// 서비스 계약요청 상세페이지 ( sw )
	@PostMapping("/serviceRequest/detailServiceRequest")
	public String getDetailRequestList(String contractManageCode) {
		
		serviceRequestService.getDetailRequestList(contractManageCode);
		
		return "redirect:/serviceRequest/detailServiceRequest";
	}
	
	@GetMapping("/serviceRequest/detailServiceRequest")
	public String getDetailRequestList(@RequestParam(value="contractManageCode", required=false) String contractManageCode
													,Model model) {
		ServiceRequest getDetailRequestList = serviceRequestService.getDetailRequestList(contractManageCode);
		model.addAttribute("title","계약요청 상세페이지");
		model.addAttribute("requestInfo", getDetailRequestList);
		
		return "sw/service/serviceRequest/detailServiceRequest";
	}
	// 서비스 계약요청 상세페이지 끝 ======================================================
	
	
	// 서비스 삭제 페이지
	@PostMapping("/deleteServiceManagement")
	public String deleteService(ServiceManagement serviceManagement) {
		log.info("서비스 삭제 페이지 / 입력받은 서비스 코드 : {}", serviceManagement);
		serviceManagementSerivce.deleteService(serviceManagement);
		
		return "redirect:/sw/service/selectServiceManagement";
	}
	@GetMapping("/deleteServiceManagement")
	public String deleteService(@RequestParam(value="serviceCode", required = false) String serviceCode
								,Model model) {
		log.info("deleteServiceManagement serviceCode : {}", serviceCode);
		model.addAttribute("title", "서비스 수정화면");
		//서비스 정보
		if(serviceCode != null && !"".equals(serviceCode)) {
			ServiceManagement ServiceInfo = serviceManagementSerivce.getServiceInfo(serviceCode);
			model.addAttribute("ServiceInfo", ServiceInfo);
		}
		
		return "sw/service/deleteServiceManagement";
	}
	// 서비스 현황(정보) 
	@GetMapping("/selectServiceManagement")
	public String getServiceManagement(Model model) {
		List<ServiceManagement> getServiceManagement = serviceManagementSerivce.getServiceManagement();
		model.addAttribute("title", "서비스 현황");
		model.addAttribute("getServiceManagement", getServiceManagement);
		
		return "sw/service/selectServiceManagement";
	}
	// 서비스 등록 페이지
	@GetMapping("/addServiceManagement")
	public String addService(Model model) {
		model.addAttribute("title", "서비스 등록");
		return "sw/service/addServiceManagement";
	}
	@PostMapping("/addServiceManagement")
	public String addService(ServiceManagement serviceManagement) {
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
		String serviceCode = serviceManagement.getServiceCode();
		//System.out.println(addService);
		
		if(serviceCode != null && !"".equals(serviceCode)) {
			System.out.println(serviceCode);
			serviceManagementSerivce.addService(serviceManagement);
		}
		return "redirect:/sw/service/selectServiceManagement";
				
	}
	// 서비스 등록페이지 - 서비스 코드 중복체크
	@PostMapping("/codeCheck")
	@ResponseBody
	public boolean serviceCheck(@RequestParam(value="serviceCode", required =false) String serviceCode){
		boolean codeCheckResult = false;
		int codeCheck = serviceManagementSerivce.serviceCheck(serviceCode);
		
		if(codeCheck > 0) {
			codeCheckResult = true;
		}
		
		return codeCheckResult;
	}
	// 서비스 수정 페이지
		@PostMapping("/modifyServiceManagement")
		public String modifyService(ServiceManagement serviceManagement) {
			log.info("서비스 수정 페이지 - 입력받은 서비스 정보 : {} ", serviceManagement);
			
			serviceManagementSerivce.modifyService(serviceManagement);
			
			return "redirect:/sw/service/selectServiceManagement";
		}
	
	@GetMapping("/modifyServiceManagement")
	public String modifyService(@RequestParam(value="serviceCode", required = false) String serviceCode
								,Model model) {
		log.info("modifyServiceManagement serviceCode : {}", serviceCode);
		model.addAttribute("title", "서비스 수정화면");
		//서비스 정보
		if(serviceCode != null && !"".equals(serviceCode)) {
			ServiceManagement getServiceInfo = serviceManagementSerivce.getServiceInfo(serviceCode);
			model.addAttribute("getServiceInfo", getServiceInfo);
		}
		
		return "sw/service/modifyServiceManagement";
	}

	
}