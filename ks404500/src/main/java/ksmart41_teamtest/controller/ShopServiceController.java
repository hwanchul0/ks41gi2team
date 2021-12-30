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
@RequestMapping("/shop/service")
public class ShopServiceController {
	
	// 계약요청 관련 의존성 주입
	private ServiceManagementService serviceManagementService;
	
	// 계약요청 관련 의존성 주입
	private RequestService requestService;
	
	public ShopServiceController(RequestService requestService , ServiceManagementService serviceManagementService) {
		this.requestService = requestService;
		this.serviceManagementService = serviceManagementService;
	}
	
	// shop - 계약요청 / sw서비스 / 계약요청 등록
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		
		return "shop/service/serviceRequest/addServiceRequest";
	}
	
	// shop - client 본인 계약요청 전체 조회
	@GetMapping("/serviceRequest/selectServiceRequest") 
	  public String getRequestList(Model model) { 
	  List<Request> getRequestList = requestService.getRequestList();
	  model.addAttribute("title", "계약요청 개인조회"); 
	  model.addAttribute("getAllRequestList", getRequestList);

	  return "shop/service/serviceRequest/selectServiceRequest"; 
	  }
	
	
	
	
}