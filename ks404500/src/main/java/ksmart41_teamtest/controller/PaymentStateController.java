package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.PaymentState;
import ksmart41_teamtest.service.PaymentStateService;

@Controller
@RequestMapping("/shop/code")
public class PaymentStateController {

	@Autowired
	private PaymentStateService paymentStateService;
	
	//[재천]결제 상태 코드 등록
	@GetMapping("/addPaymentState")
	public String addPaymentStateCode(Model model) {
		model.addAttribute("title", "결제 상태 코드 등록");
		return "shop/code/addPaymentState";
	}
	
	//[재천]결제 상태 코드 등록
	@PostMapping("/addPaymentState")
	public String addPaymentStateCode(PaymentState paymentState) {
		System.out.println("여기서 받아오자" + paymentState);
		String paymentcode = paymentState.getPaymentStateCode();
		if(paymentcode != null && !"".equals(paymentcode)) {
			paymentStateService.addPaymentStateCode(paymentState);
		}
		return "redirect:/shop/code/selectPaymentState";
	}
	
	//[재천]결제 상태 코드 등록
	@GetMapping("/selectPaymentState")
	public String selectPaymentStateCode(Model model) {
		List<PaymentState>paymentlist = paymentStateService.PaymentStateList();
		model.addAttribute("title", "결제 상태 코드 조회");
		model.addAttribute("paymentlist", paymentlist);
		return "shop/code/selectPaymentState";
	}
	
	//[재천]결제 상태 코드 수정
	@GetMapping("/modifyPaymentState")
	public String modifyPaymentStatecode(@RequestParam(value="paymentStateCode", required = false)String paymentStateCode,
			Model model) {
		model.addAttribute("title", "결제 상태 코드 수정");
		if(paymentStateCode != null && !"".equals(paymentStateCode)){
			PaymentState paymentstate = paymentStateService.selectPaymentStateCode(paymentStateCode);
			model.addAttribute("paymentstate", paymentstate);
		}
		return "/shop/code/modifyPaymentState";
	}
	
	//[재천]결제 상태 코드 수정
	@PostMapping("/modifyPaymentState")
	public String modifyPaymentStateCode(PaymentState paymentState) {
		paymentStateService.modifyPaymentStatecode(paymentState);
		return "redirect:/shop/code/selectPaymentState";
	}
	
	
	//[재천]결제 상태 코드 중복체크
	@PostMapping("/codeCheck")
	@ResponseBody
	public boolean codeCheck (@RequestParam(value = "paymentStateCode", required = false)String paymentStateCode) {
		boolean checkResult = false;
		int codeCheck = paymentStateService.codeCheck(paymentStateCode);
		
		if(codeCheck > 0) {
			checkResult = true;
		}
		return checkResult;
	}
	
	//[재천]결제상태 코드삭제
	@RequestMapping("/deletePaymentCode")
	public @ResponseBody int deletePaymentCode(PaymentState paymentStateCode) {
		return paymentStateService.deletePaymentCode(paymentStateCode);
	}
	
}

