package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.service.ServiceRequestService;
import ksmart41_teamtest.service.ServiceManagementService;

@Controller
@RequestMapping("/shop/service")
public class ShopServiceController {
	
	// 계약요청 관련 의존성 주입
	private ServiceManagementService serviceManagementService;
	
	// 계약요청 관련 의존성 주입
	private ServiceRequestService serviceRequestService;
	
	public ShopServiceController(ServiceRequestService serviceRequestService , ServiceManagementService serviceManagementService) {
		this.serviceRequestService = serviceRequestService;
		this.serviceManagementService = serviceManagementService;
	}
	
	// shop - 계약요청 / sw서비스 / 계약요청 등록
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		
		return "shop/service/serviceRequest/addServiceRequest";
	}
	// 계약요청 수정 페이지
	@GetMapping("/serviceRequest/modifyServiceRequest")
	public String modifyServiceRequest(Model model) {
		
		return "shop/service/serviceRequest/modifyServiceRequest";
	}
	// 계약요청 삭제 페이지
	@GetMapping("/serviceRequest/deleteServiceRequest")
	public String deleteServiceRequest(Model model) {
		
		return "shop/service/serviceRequest/deleteServiceRequest";
	}
	
	// shop - client 본인 계약요청 전체 조회
	@GetMapping("/serviceRequest/selectServiceRequest") 
	  public String getRequestList(Model model) { 
	  List<ServiceRequest> getRequestList = serviceRequestService.getRequestList();
	  model.addAttribute("title", "계약요청 개인조회"); 
	  model.addAttribute("getRequestList", getRequestList);

	  return "shop/service/serviceRequest/selectServiceRequest"; 
	  }
	
	
	
	
}