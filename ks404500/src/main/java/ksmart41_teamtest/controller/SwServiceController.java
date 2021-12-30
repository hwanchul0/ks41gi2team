package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Request;
import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.service.RequestService;
import ksmart41_teamtest.service.ServiceManagementService;

@Controller
@RequestMapping("/sw/service")
public class SwServiceController {
	
	// 계약요청 관련 의존성 주입
	private ServiceManagementService serviceManagementService;
	
	// 서비스 현황(정보) 의존성 
	private RequestService requestService;
	
	public SwServiceController(RequestService getAllRequestList , ServiceManagementService serviceManagementService) {
		this.requestService = getAllRequestList;
		this.serviceManagementService = serviceManagementService;
	}
	
	// 계약요청 / sw서비스 / 계약요청 등록
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		
		return "sw/service/serviceRequest/addServiceRequest";
	}
	
	// 계약요청 /  sw개발사 내부직원권한 / client 전체 계약요청 조회
	@GetMapping("/serviceRequest/selectAllServiceRequest") 
	  public String getAllRequestList(Model model) { 
	  List<Request> getAllRequestList = requestService.getAllRequestList();
	  
	  model.addAttribute("title", "계약요청 전체조회"); 
	  model.addAttribute("getAllRequestList", getAllRequestList);

	  return "sw/service/serviceRequest/selectAllServiceRequest"; 
	  }
	
	// 서비스 현황(정보) 
	@GetMapping("/selectServiceManagement")
	public String getServiceManagement(Model model) {
		List<ServiceManagement> getServiceManagement = serviceManagementService.getServiceManagement();
		
		model.addAttribute("title", "서비스 현황");
		model.addAttribute("getServiceManagement", getServiceManagement);
		
		return "sw/service/selectServiceManagement";
	}
	
	
	
}