package ksmart41_teamtest.controller;


import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.service.AccountingService;
import ksmart41_teamtest.service.InvoiceListService;

@Controller
@RequestMapping("/sw/accounting")
public class SwAccountingController {
	
	private static final Logger log = LoggerFactory.getLogger(SwAccountingController.class);
	
	@Autowired
	private InvoiceListService invoiceListService;
	
	@Autowired
	private AccountingService accountingService;
	
	
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
	
	//유경 - 개발사 세금계산서상세정보조회
	@RequestMapping("/viewInvoice")
	public String InvoiceView(@ModelAttribute("viewInvoice") InvoiceList viewInvoice,
			@RequestParam("invoiceCode") String invoiceCode, Model model) {
		InvoiceList getInvoiceView = invoiceListService.getInvoiceView(invoiceCode);
		model.addAttribute("getInvoiceView", getInvoiceView);
		System.out.println("getInvoiceView"+getInvoiceView);
		return "sw/accounting/viewInvoice";
	}
	
	
	//유경 - 개발사 세금계산서 목록 조회
	@GetMapping("/selectInvoice")
	public String selectInvoice(Model model) {
		List<InvoiceList> invoiceList = invoiceListService.getInvoiceList();
		model.addAttribute("invoiceList", invoiceList);
		return "sw/accounting/selectInvoice";
	}
	
	

	//유경 - 세.계 등록화면 - 계약내용조회
	@GetMapping("/addInvoice")
	public String addByBizInvoice(Model model) {
		//List<Business> bizname = businessService.getBusiness();
		//model.addAttribute("bizname", bizname);
		//System.out.println("bizname" + bizname);
		List<GetInvoiceInfo> getInvoiceInfo = accountingService.getAddByBizInvoice();
		model.addAttribute("getInvoiceInfo", getInvoiceInfo);
		//System.out.println("계약내용 : "+ getInvoiceInfo);
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