package ksmart41_teamtest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	
	
	// 계약요청 전체 조회 (sw개발사)
	@GetMapping("/selectAllServiceRequest") 
	public String getAllRequestList(Model model) { 
	List<ServiceRequest> getAllRequestList = serviceRequestService.getAllRequestList();
	model.addAttribute("title", "계약요청 전체 조회"); 
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

	
	// 서비스 계약요청 확인 -> 승인 페이지
	@PostMapping("/modifyRequestState")
	public String serviceRequestState(@RequestParam(value="serviceRequestStatus", required=false)String serviceRequestStatus
									 ,@RequestParam(value="contractManageCode", required = false) String contractManageCode
									 ,ServiceRequest serviceRequest) {
		log.info("serviceRequestState 계약 상태 === :{}"  ,serviceRequestStatus);
		log.info("serviceRequestState 계약 상태 코드  === :{}"  ,contractManageCode);
		log.info("serviceRequestState 입력받은 값  === :{}"  ,serviceRequest);
		serviceRequestService.modifyRequestState(serviceRequestStatus,contractManageCode);
		
		String RequestStatus = serviceRequest.getServiceRequestStatus();
		String requsetAccept = "승인";
		
		if(RequestStatus.equals(requsetAccept)) {
			// selectAllServiceRequest 계약 상태가 '승인' 일 때  결제 예정 합계 테이블 insert 쿼리 실행
			serviceRequestService.acceptRequest(contractManageCode,serviceRequest.getSlipNumber());
			// 계약 상태가 '승인' 일때 승인 날짜 변경
			serviceRequestService.nowApprovalDate(contractManageCode);
		}else {
			// selectAllServiceRequest 계약상태가 '승인' 이 아닐 때 delete
			serviceRequestService.deleteRequest(contractManageCode);
		}
			
		
		return "redirect:/sw/service/serviceRequest/selectAllServiceRequest";
  }

	


	
}