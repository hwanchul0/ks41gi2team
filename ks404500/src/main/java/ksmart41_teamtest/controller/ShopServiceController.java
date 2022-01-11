package ksmart41_teamtest.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger log = LoggerFactory.getLogger(ShopServiceController.class);
	// 계약요청 관련 의존성 주입
	private ServiceManagementService serviceManagementService;
	
	// 계약요청 관련 의존성 주입
	private ServiceRequestService serviceRequestService;
	
	public ShopServiceController(ServiceRequestService serviceRequestService , ServiceManagementService serviceManagementService) {
		this.serviceRequestService = serviceRequestService;
		this.serviceManagementService = serviceManagementService;
	}
	
	
	
	
	
	
}