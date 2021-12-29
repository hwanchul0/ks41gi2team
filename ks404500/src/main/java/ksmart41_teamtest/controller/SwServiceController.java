package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/service")
public class SwServiceController {
	
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		return "sw/service/serviceRequest/addServiceRequest";
	}
	
	@GetMapping("/serviceRequest/selectServiceRequest")
	public String selectServiceRequest() {
		return "sw/service/serviceRequest/selectServiceRequest";
	}
	
	@GetMapping("/serviceStatus")
	public String serviceStatus() {
		return "sw/service/serviceStatus";
	}
	
	
	
}