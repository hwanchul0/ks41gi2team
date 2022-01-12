package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String addExpense(@RequestParam(value = "swExpensePayCode", required = false)String swExpensePayCode,
			Model model) {
		if(swExpensePayCode != null && !"".equals(swExpensePayCode)) {
			SwExpense swexpense = swExpenseService.selectSwExpenseInfo(swExpensePayCode);
			model.addAttribute("swexpense", swexpense);
		}
		model.addAttribute("title","비용 등록");
		return "sw/accounting/addExpense";
	}
	
	//[재천]비용 등록
	@PostMapping("/addExpense")
	public String addExpense(SwExpense swExpense) {
		System.out.println("swExpenseController에서 받은 값 >>> " + swExpense);
		
		/*
		 * 일단 등록은됨 나중에지우기!!!!!!
		 * 여기부터
		 */
		swExpense.setSwIsCode("80100");
		swExpense.setMemberId("swid001");
		//swExpense.setMemberIdFinish("swid001");
		/* 여기까지
		 * 일단 등록은됨 나중에지우기!!!!!!
		 */
		
		swExpenseService.addExpense(swExpense);
		return "redirect:/sw/accounting/selectExpense";
	}
}
