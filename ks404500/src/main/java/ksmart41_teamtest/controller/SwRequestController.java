package ksmart41_teamtest.controller;

import java.util.List;
import java.util.Map;

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

import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.service.ServiceRequestService;

@Controller
@RequestMapping("/sw/service/serviceRequest/")
public class SwRequestController {
	
	private static final Logger log = LoggerFactory.getLogger(SwRequestController.class);
	
	@Autowired
	private ServiceRequestService serviceRequestService;
	
	
	public SwRequestController(ServiceRequestService serviceRequestService) {
		this.serviceRequestService = serviceRequestService;
	}

	// 계약요청 수정 페이지
	@GetMapping("/modifyServiceRequest")
	public String modifyServiceRequest(Model model) {
		
		return "sw/service/serviceRequest/modifyServiceRequest";
	}
	// 계약요청 삭제 페이지
	@GetMapping("/deleteServiceRequest")
	public String deleteServiceRequest(Model model) {
		
		return "sw/service/serviceRequest/deleteServiceRequest";
	}
	
	
	// 계약요청 전체 조회 (sw개발사)
	@GetMapping("/selectAllServiceRequest") 
	public String getAllRequestList(Model model) { 
	List<ServiceRequest> getAllRequestList = serviceRequestService.getAllRequestList();
	model.addAttribute("title", "회원전체조회"); 
	model.addAttribute("getAllRequestList", getAllRequestList);

	return "sw/service/serviceRequest/selectAllServiceRequest"; 
	}
	// 서비스 계약요청 상세페이지 ( sw )
	@PostMapping("/detailServiceRequest")
	public String getDetailRequestList(String contractManageCode) {
		
		serviceRequestService.getDetailRequestList(contractManageCode);
		
		return "redirect:/serviceRequest/detailServiceRequest";
	}
	
	@GetMapping("/detailServiceRequest")
	public String getDetailRequestList(@RequestParam(value="contractManageCode", required=false) String contractManageCode
													,Model model) {
		ServiceRequest getDetailRequestList = serviceRequestService.getDetailRequestList(contractManageCode);
		model.addAttribute("title","계약요청 상세페이지");
		model.addAttribute("requestInfo", getDetailRequestList);
		
		return "sw/service/serviceRequest/detailServiceRequest";
	}
	// 서비스 계약요청 상세페이지 끝 ======================================================
	
	

	
	// client /  계약요청 등록
	@GetMapping("/addServiceRequest")
	public String addServiceRequest() {
		
		return "sw/service/serviceRequest/addServiceRequest";
	}
	// client / 계약요청 등록 /  내 사업장별 대표코드 조회하기 modal
	@PostMapping("/findMyMainBizCode")
	@ResponseBody
	public List<Map<String, Object>> findMyMainBizCode(){
		List<Map<String, Object>> myMainBizCode = serviceRequestService.findMyMainBizCode();
		log.info("PostMapping 계약요청 등록 - 내 사업장별 대표코드 조회 결과 :{}" , myMainBizCode);
		return myMainBizCode;
	}
	
	// client 본인 계약요청 조회
	@GetMapping("/selectServiceRequest") 
	  public String getRequestList(Model model) { 
	  List<ServiceRequest> getRequestList = serviceRequestService.getRequestList();
	  model.addAttribute("title", "계약요청 개인조회"); 
	  model.addAttribute("getRequestList", getRequestList);

	  return "sw/service/serviceRequest/selectServiceRequest"; 
	  }

	
}