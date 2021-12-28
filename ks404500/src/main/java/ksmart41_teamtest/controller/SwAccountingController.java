package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/accounting")
public class SwAccountingController {
	
	@GetMapping("/selectInvoiceDetail")
	public String selectInvoiceDetail() {
		return "sw/accounting/selectInvoiceDetail";
	}
	
	@GetMapping("/addInvoiceDetail")
	public String addInvoiceDetail() {
		return "sw/accounting/addInvoiceDetail";
	}
	
	@GetMapping("/selectTotalAccounting")
	public String selectTotalAccounting() {
		return "sw/accounting/selectTotalAccounting";
	}
	
	@GetMapping("/selectExpense")
	public String selectExpense() {
		return "sw/accounting/selectExpense";
	}
	
	@GetMapping("/addExpense")
	public String addExpense() {
		return "sw/accounting/addExpense";
	}
	
	@GetMapping("/selectInvoice")
	public String selectInvoice() {
		return "sw/accounting/selectInvoice";
	}
	
	@GetMapping("/addInvoice")
	public String addInvoice() {
		return "sw/accounting/addInvoice";
	}
	
	@GetMapping("/addPaymentSum")
	public String addPaymentSum() {
		return "sw/accounting/addPaymentSum";
	}
	
	@GetMapping("/selectIncome")
	public String selectIncome() {
		return "sw/accounting/selectIncome";
	}
	
	@GetMapping("/addIncome")
	public String addIncome() {
		return "sw/accounting/addIncome";
	}
	
	
}