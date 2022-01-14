package ksmart41_teamtest.controller;


import java.util.List;
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

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwTotalAccounting;
import ksmart41_teamtest.service.AccountingService;
import ksmart41_teamtest.service.InvoiceListService;
import ksmart41_teamtest.service.InvoiceReasonService;

@Controller
@RequestMapping("/sw/accounting")
public class SwAccountingController {
	
	private static final Logger log = LoggerFactory.getLogger(SwAccountingController.class);
	
	@Autowired
	private InvoiceListService invoiceListService;
	
	@Autowired
	private AccountingService accountingService;
	/*유경 */
	@Autowired
	private InvoiceReasonService invoiceReasonService;


	
	
	//유경 - 개발사 세금계산서상세정보조회
	@RequestMapping("/viewInvoice")
	public String InvoiceView(@ModelAttribute("viewInvoice") InvoiceList viewInvoice,
			@RequestParam("invoiceCode") String invoiceCode, Model model) {
		InvoiceList getInvoiceView = invoiceListService.getInvoiceView(invoiceCode);
		model.addAttribute("invoiceView", getInvoiceView);
		log.info("invoiceView ==== {} ",getInvoiceView);
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
		List<GetInvoiceInfo> getInvoiceInfo = accountingService.getAddByBizInvoice();
		//세.계 기본 코드 자동증가 가져오기
		InvoiceList invoiceCode = accountingService.getInvoiceCode();
		//세.계 기본 코드 세부자동증가 가져오기
		InvoiceList invoiceDetailCode = accountingService.getInvoiceDetailCode();

		model.addAttribute("getInvoiceInfo", getInvoiceInfo);
		model.addAttribute("invoiceCode", invoiceCode);
		model.addAttribute("invoiceDetailCode", invoiceDetailCode);
		//System.out.println("계약내용 : "+ getInvoiceInfo);
		return "sw/accounting/addInvoice";
	}
	
	//유경 - 세.계 등록
	@PostMapping("/addInvoice")
	public String addInvoiceByContract(InvoiceList invoiceList) {
		log.info("invoiceList 받은정보 : {}", invoiceList );
		//세금계산서 일반 등록
		accountingService.addInvoiceByContract(invoiceList);
		accountingService.addDetailInvoiceByContract(invoiceList);
		return "redirect:/sw/accounting/addInvoice";
	}
	
	//유경 - 세금계산서 수정발행 
	@GetMapping("/amendInvoice")
	public String amendInvoice(Model model, @RequestParam("invoiceCode") String invoiceCode) {
		InvoiceList newcode = accountingService.getInvoiceCode();
		model.addAttribute("newcode", newcode);
		
		//세.계 기본 코드 자동증가 가져오기
		InvoiceList newCode = accountingService.getInvoiceCode();
		model.addAttribute("newCode", newCode);
		
		//세.계 기본 코드 세부자동증가 가져오기
		InvoiceList invoiceDetailCode = accountingService.getInvoiceDetailCode();
		model.addAttribute("invoiceDetailCode", invoiceDetailCode);
		

		//수정사유 목록 받아오기
		List<InvoiceReason> invoiceReason = invoiceReasonService.getInvoiceReasonList();
		model.addAttribute("invoiceReason", invoiceReason);
		System.out.println("invoiceReason"+invoiceReason);
		
		//수정할 세.계 정보 받아오기
		if(invoiceCode != null && !"".equals(invoiceCode)) {
			InvoiceList amendInvoice = accountingService.getAmendInvoice(invoiceCode);
			model.addAttribute("amendInvoice", amendInvoice);
			log.info("amendInvoice ========== {}",amendInvoice);
		}
		return "sw/accounting/amendInvoice";
	}
	
	//유경 - 세금계산서 수정발행 
	@PostMapping("/amendInvoice")
	public String amendInvoicByDefault(InvoiceList invoiceList,Model model) {
		//기존 발행 내역 수정 update 실행
		log.info("계산서 수정 입력받은 값 ====== {}",invoiceList);
		accountingService.amendInvoicByDefault(invoiceList);
		//추가 세금계산서 발행 - 일반
		accountingService.addAmendInvoice(invoiceList);
		//추가 세금계산서 발행 - 상세
		accountingService.addDetailAmendInvoice(invoiceList);
		return "redirect:/sw/accounting/selectInvoice";
	}
	
	//유경 - 통합매출 회계조회 
	@GetMapping("/addTotalAccounting")
	public String addTotalAccountingIncome(Model model) {
		//매출 등록대상 내역 조회
		List<SwTotalAccounting> SwTotalIncome = accountingService.addTotalAccountingIncome();
		model.addAttribute("SwTotalIncome", SwTotalIncome);
		return "sw/accounting/addTotalAccounting";
	}
	
	//유경 - 통합매출 회계등록
	@PostMapping("/addTotalAccounting")
	public String addTotalAccountingByIncome(SwTotalAccounting swTotalAccounting){
		accountingService.addTotalByIncome(swTotalAccounting);
		return "redirect:/sw/accounting/addTotalAccounting";
	}
	
	//유경 - 통합비용 회계조회 
	@GetMapping("/addTotalAccountingExpense")
	public String addTotalAccountingExpense(Model model) {
		//비용 등록대상 내역 조회
		List<SwTotalAccounting> SwTotalExpense = accountingService.addTotalAccountingExpense();
		model.addAttribute("SwTotalExpense", SwTotalExpense);
		return "sw/accounting/addTotalAccountingExpense";
	}
	
	//유경 - 통합비용 회계등록
	@PostMapping("/addTotalAccountingExpense")
	public String addTotalAccountingByExpense(SwTotalAccounting swTotalAccounting){
		accountingService.addTotalByExpense(swTotalAccounting);
		return "redirect:/sw/accounting/addTotalAccountingExpense";
	}
	
	//유경 - 통합회계 조회
	@GetMapping("/selectTotalAccounting")
	public String selectTotalAccounting() {
		return "sw/accounting/selectTotalAccounting";
	}
	

	
	@GetMapping("/addPaymentSum")
	public String addPaymentSum() {
		return "sw/accounting/addPaymentSum";
	}
	
}