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
@RequestMapping("/sw/service")
public class SwServiceController {
	
	private static final Logger log = LoggerFactory.getLogger(SwServiceController.class);
	
	@Autowired
	private ServiceManagementService serviceManagementSerivce;
	
	
	public SwServiceController(ServiceManagementService serviceManagementSerivce) {
		this.serviceManagementSerivce = serviceManagementSerivce;
	}
	
	
	// 서비스 현황(정보) 
	@GetMapping("/selectServiceManagement")
	public String getServiceManagement(HttpSession session, ServiceManagement myService, Model model) {
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


	// 서비스 수정 페이지 ========================================================
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
	// =================================================================서비스 수정 페이지
}