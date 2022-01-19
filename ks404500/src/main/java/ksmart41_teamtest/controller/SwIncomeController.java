package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.SwIncome;
import ksmart41_teamtest.service.SwIncomeService;

@Controller
@RequestMapping("/sw/accounting")
public class SwIncomeController {
	
	@Autowired
	private SwIncomeService swIncomeService;
	
	//[재천]매출 조회
	@RequestMapping("/selectIncome")
	public String selectIncome(SwIncome swIncome, Model model) {
		List<SwIncome> incomelist = swIncomeService.selectSwIncomeList();
		model.addAttribute("incomelist", incomelist);
		/*
		int addSwIncome1 = swIncomeService.addSwIncome1(swIncome);
		int addSwIncome2 = swIncomeService.addSwIncome2(swIncome);
		model.addAttribute("addSwIncome1", addSwIncome1);
		model.addAttribute("addSwIncome2", addSwIncome2);
		*/
		model.addAttribute("title", "매출 조회");
		return "sw/accounting/selectIncome";
	}
	
	
	
	
	/*
	//[재천]매출 조회
	@GetMapping("/selectIncome")
	public String selectIncome(Model model) {
		List<SwIncome> incomelist = swIncomeService.selectSwIncomeList();
		model.addAttribute("title", "매출 조회");
		model.addAttribute("incomelist", incomelist);
		return "sw/accounting/selectIncome";
	}
	//[재천]매출 등록
	@GetMapping("/addIncome")
	public String addIncome() {
		return "sw/accounting/addIncome";
	}
	*/
}
