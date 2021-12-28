package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/code")
public class SwCodeController {
	
	@GetMapping("/addBusinessCode")
	public String addBusinessCode() {
		return "sw/code/addBusinessCode";
	}
	
	@GetMapping("/selectBusinessCode")
	public String selectBusinessCode() {
		return "sw/code/selectBusinessCode";
	}
	
	@GetMapping("/addLocalCode")
	public String addLocalCode() {
		return "sw/code/addLocalCode";
	}
	
	@GetMapping("/selectLocalCode")
	public String selectLocalCode() {
		return "sw/code/selectLocalCode";
	}
	
	@GetMapping("/addInvoiceReasonCode")
	public String addInvoiceReasonCode() {
		return "sw/code/addInvoiceReasonCode";
	}
	
	@GetMapping("/selectInvoiceReasonCode")
	public String selectInvoiceReasonCode() {
		return "sw/code/selectInvoiceReasonCode";
	}
	
	@GetMapping("/addIsListCode")
	public String addIsListCode() {
		return "sw/code/addIsListCode";
	}
	
	@GetMapping("/addContractStateCode")
	public String addContractStateCode() {
		return "sw/code/addContractStateCode";
	}
	
	@GetMapping("/selectContractStateCode")
	public String selectContractStateCode() {
		return "sw/code/selectContractStateCode";
	}
	
	@GetMapping("/addPaymentStateCode")
	public String addPaymentStateCode() {
		return "sw/code/addPaymentStateCode";
	}
	
	@GetMapping("/selectPaymentStateCode")
	public String selectPaymentStateCode() {
		return "sw/code/selectPaymentStateCode";
	}
	
	@GetMapping("/addContractRefundStateCode")
	public String addContractRefundStateCode() {
		return "sw/code/addContractRefundStateCode";
	}
	
	@GetMapping("/selectContractRefundStateCode")
	public String selectContractRefundStateCode() {
		return "sw/code/selectContractRefundStateCode";
	}
	
	

}
