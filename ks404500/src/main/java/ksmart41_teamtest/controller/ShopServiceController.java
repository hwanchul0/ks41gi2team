package ksmart41_teamtest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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

import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.service.ServiceManagementService;

@Controller
@RequestMapping("/shop/service")
public class ShopServiceController {
	
	private static final Logger log = LoggerFactory.getLogger(ShopServiceController.class);
	
	@Autowired
	private ServiceManagementService serviceManagementSerivce;
	
	
	public ShopServiceController(ServiceManagementService serviceManagementSerivce) {
		this.serviceManagementSerivce = serviceManagementSerivce;
	}
	
	
	// 서비스 현황(정보) 
	@GetMapping("/selectService")
	public String getServiceManagement(HttpSession session, ServiceManagement myService, Model model) {
		List<ServiceManagement> getServiceManagement = serviceManagementSerivce.getServiceManagement();
		model.addAttribute("title", "서비스 현황");
		model.addAttribute("getServiceManagement", getServiceManagement);
		
		return "shop/service/selectService";
	}
}