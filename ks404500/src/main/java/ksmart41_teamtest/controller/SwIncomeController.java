package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		model.addAttribute("title", "매출 조회");
		return "sw/accounting/selectIncome";
	}
	
	
	//[재천]매출 삭제
	@RequestMapping("/deleteIncome")
	public @ResponseBody int deleteIncome(SwIncome swIncome) {
		return swIncomeService.deleteIncome(swIncome);
	}
}
