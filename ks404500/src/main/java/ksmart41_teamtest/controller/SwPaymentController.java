
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

import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.service.ServicePaymentService;
import ksmart41_teamtest.service.SwIncomeService;

@Controller
@RequestMapping("/sw/service")
public class SwPaymentController {
	
	private static final Logger log = LoggerFactory.getLogger(SwPaymentController.class);
	
	@Autowired
	private ServicePaymentService servicePaymentService;
	//재천 의존성주입
	@Autowired
	private SwIncomeService swIncomeService;
	
	public SwPaymentController(ServicePaymentService servicePaymentService) {
		this.servicePaymentService = servicePaymentService;
	}
	
	// 서비스 결제 예정 조회 (sw 개발사)
	@GetMapping("/servicePaymentSum")
	public String getServicePaymentSum(Model model) {
		List<ServicePayment> getServicePaymentSum = servicePaymentService.getServicePaymentSum();
		model.addAttribute("title","계약요청 - 결제예정 조회");
		model.addAttribute("getServicePaymentSum",getServicePaymentSum);
		return "sw/service/servicePaymentSum";
	}
	// 서비스 결제예정 확인 테이블 (sw 개발사)
	@PostMapping("/servicePaymentCheck")
		public String servicePaymentCheck(String paymentCode) {
		
		servicePaymentService.servicePaymentCheck(paymentCode);
		
		return "redirect:/servicePaymentCheck";
	}
	
	@GetMapping("/servicePaymentCheck")
	public String servicePaymentCheck (@RequestParam(value="paymentCode", required=false) String paymentCode,
			@RequestParam(value = "swIsCode", required = false) String swIsCode,
											Model model) {
		ServicePayment servicePaymentCheck = servicePaymentService.servicePaymentCheck(paymentCode);
		model.addAttribute("title","서비스 결제확인");
		model.addAttribute("servicePaymentCheck",servicePaymentCheck);
		model.addAttribute("PaymentStateCode",servicePaymentService.getPaymentStateCode());
		
		return "sw/service/servicePaymentCheck";
	}
	
	
	//[재천] ++추가
	// 서비스 결제예정 확인 -> 결제예정 결제상태 업데이트
	@PostMapping("/modifyPaymentState")
	public String modifyPaymentState(	@RequestParam(value="servicePaymentCheck" , required = false) String paymentStateCode,
										@RequestParam(value="paymentCode" , required = false) String paymentCode,
										@RequestParam(value = "paymentState", required = false) String paymentState,
										@RequestParam(value = "servicePaymentCheck", required = false)String servicePaymentCheck,
										Model model, ServicePayment servicePayment, HttpSession session) {
		
		log.info("서비스 결제정보 코드  {} : " + paymentCode);
		log.info("서비스 결제 상태  코드  {} : " + paymentStateCode);
		servicePaymentService.modifyPaymentStateCode(paymentCode,paymentStateCode);
		
		//재천코드
		//servicePaymentCheck
		String Check1 = servicePayment.getServicePaymentCheck();
		String complete = "payComplete";
		
		String memberId = (String) session.getAttribute("SWID");
		servicePayment.setMemberId(memberId);
		servicePayment.setMemberIdFinish(memberId);
		if(Check1.equals(complete)) {
			servicePaymentService.addContractState(servicePayment);
			swIncomeService.addSwIncome(servicePayment);
		}
		return "redirect:/sw/service/servicePaymentSum";
	}
	
	//서비스 결제후 계약현황 조회
	@GetMapping("/selectContractState")
	public String selectContractState(Model model) {
		List<ServicePayment> selectContractState = servicePaymentService.selectContractState();
		log.info("계약현황 리스트 {} : " + selectContractState);
		model.addAttribute("title","서비스 계약현황 ");
		model.addAttribute("selectContractState",selectContractState);
		return "sw/service/selectContractState";
	}
	
	//계약현황 관리 - 수정
	@PostMapping("/modifyContractState")
	public String modifyContractState(ServicePayment servicePayment) {
		log.info("계약현황 관리 수정 페이지 | 입력받은 계약코드 ===== :{} ", servicePayment);
		return "redirect:/sw/service/selectContractState";
	}
	
	@GetMapping("modifyContractState")
	public String modifyContractState(@RequestParam(value="contractCode", required = false) String contractCode
										,Model model) {
		model.addAttribute("title","계약현황 수정");
		
		if(contractCode != null && !"".equals(contractCode)) {
			ServicePayment contractInfo = servicePaymentService.getContractState(contractCode);
			model.addAttribute("contractInfo", contractInfo);
		}
		
		return "sw/service/modifyContractState";
	}
}