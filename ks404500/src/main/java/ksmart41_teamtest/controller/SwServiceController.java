package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.service.ServiceRequestService;
import ksmart41_teamtest.service.ServiceManagementService;
import ksmart41_teamtest.service.ServicePaymentService;

@Controller
@RequestMapping("/sw/service")
public class SwServiceController {
	
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
	
	
	// 서비스 결제 예정 (sw 개발사)
	@GetMapping("/servicePaymentSum")
	public String getServicePaymentSum(Model model) {
		List<ServicePayment> getServicePaymentSum = servicePaymentService.getServicePaymentSum();
		model.addAttribute("title","계약요청 - 결제예정 조회");
		model.addAttribute("getServicePaymentSum",getServicePaymentSum);
		return "sw/service/servicePaymentSum";
	}
	// 서비스 결제예정 상세 (sw 개발사)
	@PostMapping("/detailServicePayment")
		public String getDetailServicePayment(String paymentCode) {
		
		servicePaymentService.getDetailServicePayment(paymentCode);
		
		return "redirect:/detailServicePayment";
	}
	@GetMapping("/detailServicePayment")
	public String getDetailServicePayment (@RequestParam(value="paymentCode", required=false) String paymentCode,
											Model model) {
		
		ServicePayment getDetailServicePayment = servicePaymentService.getDetailServicePayment(paymentCode);
		model.addAttribute("title","계약요청 결제예정 상세");
		model.addAttribute("getDetailServicePayment",getDetailServicePayment);
		
		return "sw/service/detailServicePayment";
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
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
		System.out.println("SwServiceController 서비스 추가 입력받은 값 : " + serviceManagement );
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
	@GetMapping("/modifyServiceManagement")
	public String modifyService(Model model) {
		
		return "sw/service/modifyServiceManagement";
	}
	// 서비스 삭제 페이지
	@GetMapping("/deleteServiceManagement")
	public String deleteService(Model model) {
		
		return "sw/service/deleteServiceManagement";
	}
	
}