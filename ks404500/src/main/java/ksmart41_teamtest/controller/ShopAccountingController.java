package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/accounting")
public class ShopAccountingController {
	
	@GetMapping("/addExpense")
	public String addExpense() {
		return "shop/accounting/addExpense";
	}
	
	@GetMapping("/addIncome")
	public String addIncome() {
		return "shop/accounting/addIncome";
	}
	
	@GetMapping("/addTotalAccounting")
	public String addTotalAccounting() {
		return "shop/accounting/addTotalAccounting";
	}
	
	@GetMapping("/selectExpense")
	public String selectExpense() {
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