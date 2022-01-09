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
	
	// shop - 계약요청 / sw서비스 / 계약요청 등록
	@GetMapping("/serviceRequest/addServiceRequest")
	public String addServiceRequest() {
		
		return "shop/service/serviceRequest/addServiceRequest";
	}
	// shop - 계약요청 등록 / 내 사업장별 대표코드 조회하기 modal
	@PostMapping("/findMyMainBizCode")
	@ResponseBody
	public List<Map<String, Object>> findMyMainBizCode(){
		List<Map<String, Object>> myMainBizCode = serviceRequestService.findMyMainBizCode();
		log.info("PostMapping 계약요청 등록 - 내 사업장별 대표코드 조회 결과 ----" , myMainBizCode);
		return myMainBizCode;
	}
	// 계약요청 등록 / 총 결제금액 계산하기(불러오기)
	
	
	
	
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