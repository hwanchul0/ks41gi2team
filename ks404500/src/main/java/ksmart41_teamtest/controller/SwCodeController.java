package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.InvoiceReasonService;
import ksmart41_teamtest.service.SwIsListService;

@Controller
@RequestMapping("/sw/code")
public class SwCodeController {
	
	@Autowired
	private InvoiceReasonService invoiceReasonService;
	@Autowired
	private SwIsListService swIsListService;
	
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
	
	/*유경 개발사 세금계산서 사유코드 조회 */
	@GetMapping("/selectInvoiceReasonCode")
	public String selectInvoiceReasonCode(Model model) {
		List<InvoiceReason> invoiceReason = invoiceReasonService.getInvoiceReasonList();
		model.addAttribute("title", "세금계산서수정 사유 코드 조회");
		model.addAttribute("invoiceReason", invoiceReason);
		System.out.println(invoiceReason + "<-- controller");
		return "sw/code/selectInvoiceReasonCode";
	}
	
	@GetMapping("/addIsListCode")
	public String addIsListCode(Model model) {
		return "sw/code/addIsListCode";
	}
	
	/*유경 개발사 손익계정과목 조회*/
	@GetMapping("/selectIsListCode")
	public String selectIsListCode(Model model) {
		List<SwIsListCode> swIsListCode = swIsListService.getSwIsListCode();
		model.addAttribute("title", "손익계정과목 조회");
		model.addAttribute("swIsListCode", swIsListCode);
		System.out.println(swIsListCode + "controller");
		return "sw/code/selectIsListCode";
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
