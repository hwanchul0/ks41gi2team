package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.Expense;
import ksmart41_teamtest.dto.ShopAddAccounting;
import ksmart41_teamtest.service.ExpenseService;
import ksmart41_teamtest.service.ShopAcountingService;

@Controller
@RequestMapping("/shop/accounting")
public class ShopAccountingController {
	
	@Autowired
	private ShopAcountingService shopAcountingService;
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/addExpense")
	public String addExpense() {
		return "shop/accounting/addExpense";
	}
	
	//유경 - 쇼핑몰 매출 등록화면에서 발행 대상 조회
	@GetMapping("/addIncome")
	public String showAddIncome(Model model) {
		List<ShopAddAccounting> shopAddAccounting = shopAcountingService.getAddIncome();
		ShopAddAccounting shopAddIncomeCode = shopAcountingService.getAddIncomeCode();
		
		model.addAttribute("shopAddAccounting", shopAddAccounting);
		model.addAttribute("shopAddIncomeCode", shopAddIncomeCode);
		//System.out.println(shopAddIncomeCode);
		return "shop/accounting/addIncome";
	}
	
	//유경 - 쇼핑몰 매출 등록
	@PostMapping("/addIncome")
	public String addIncome(@RequestParam(value="shopIncomeCode", required=false) String shopIncomeCode
			,ShopAddAccounting shopAddAccounting) {
		System.out.println("입력받은 값 : " + shopAddAccounting);
		String code = shopAddAccounting.getAddIncomeCode();
		if(code!= null && !"".equals(code)) {
			shopAcountingService.addIncome(shopAddAccounting);
		}
		
		return "redirect:/shop/accounting/addIncome";
	}
	
	@GetMapping("/addTotalAccounting")
	public String addTotalAccounting() {
		return "shop/accounting/addTotalAccounting";
	}
	
	/* 유성 쇼핑몰 비용 조회 */
	@GetMapping("/selectExpense")
	public String selectExpense(Model model) {
		List<Expense> expense = expenseService.getExpense();
		model.addAttribute("tilte", "비용조회");
		model.addAttribute("expense", expense);
		System.out.println(expense + "<--controller");
		return "shop/accounting/selectExpense";
	}
	
	@GetMapping("/selectIncome")
	public String selectIncome() {
		return "shop/accounting/selectIncome";
	}
	
	@GetMapping("/selectTotalAccounting")
	public String selectTotalAccounting() {
		return "shop/accounting/selectTotalAccounting";
	}
	
	
}