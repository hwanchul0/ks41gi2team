package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.SwExpense;
import ksmart41_teamtest.service.SwExpenseService;

@Controller
@RequestMapping("/sw/accounting")
public class SwExpenseController {

	@Autowired
	public SwExpenseService swExpenseService;
	
	//[재천]비용 조회
	@GetMapping("/selectExpense")
	public String selectExpense(Model model) {
		List<SwExpense> expenselist = swExpenseService.selectSwExpenseList();
		model.addAttribute("title" , "비용조회");
		model.addAttribute("expenselist" , expenselist);
		return "sw/accounting/selectExpense";
	}
	
	//[재천]비용 등록
	@GetMapping("/addExpense")
	public String addExpense() {
		return "sw/accounting/addExpense";
	}
}
