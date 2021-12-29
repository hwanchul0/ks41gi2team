package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.service.InvoiceListService;

@Controller
@RequestMapping("/sw/accounting")
public class SwAccountingController {
	
	@Autowired
	private InvoiceListService invoiceListService;
	
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
	
	//세금계산서 조회
	@GetMapping("/selectInvoice")
	public String selectInvoice(Model model) {
		List<InvoiceList> invoiceList = invoiceListService.getInvoiceList();
		model.addAttribute("invoiceList", invoiceList);
		return "sw/accounting/selectInvoice";
	}
	
	
	//세금계산서 조회 - 모달.. 안되는중 ㅜㅜㅜ 
	@GetMapping("/111")
	public String invoiceModal(Model model) {
		List<InvoiceList> invoiceList = invoiceListService.getInvoiceList();
		model.addAttribute("invoiceList", invoiceList);
		return "sw/accounting/111";
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