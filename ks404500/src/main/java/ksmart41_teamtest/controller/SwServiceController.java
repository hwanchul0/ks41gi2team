package ksmart41_teamtest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String modifyPaymentState(@RequestParam(value="servicePaymentCheck" , required = false) String servicePaymentCheck
									,@RequestParam(value="paymentCode" , required = false) String paymentCode) {
		log.info("서비스 결제정보 코드 : {}" + paymentCode);
		log.info("서비스 결제 상태  코드 : {}" + servicePaymentCheck);
		servicePaymentService.modifyPaymentStateCode(paymentCode,servicePaymentCheck);
		return "redirect:/sw/service/servicePaymentSum";
	}
	
	
	
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
	// 서비스 계약요청 상세페이지 끝
	
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
	// 서비스 삭제 페이지
	@GetMapping("/deleteServiceManagement")
	public String deleteService(Model model) {
		
		return "sw/service/deleteServiceManagement";
	}
	
}