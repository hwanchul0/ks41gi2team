package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Request;
import ksmart41_teamtest.service.RequestService;

@Controller
@RequestMapping("/sw/service")
public class SwServiceController {
	
	private RequestService requestService;
	
	public SwServiceController(RequestService requestService) {
		this.requestService = requestService;
	}
	
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		return "sw/service/serviceRequest/addServiceRequest";
	}
	
	@GetMapping("/serviceRequest/selectServiceRequest") 
	  public String getRequestList(Model model) { 
	  List<Request> requestList = requestService.getRequestList();
	  
	  model.addAttribute("title", "회원전체조회"); 
	  model.addAttribute("requestList", requestList);

	  return "sw/service/serviceRequest/selectServiceRequest"; 
	  }
	
	@GetMapping("/serviceStatus")
	public String serviceStatus() {
		return "sw/service/serviceStatus";
	}
	
	
	
}