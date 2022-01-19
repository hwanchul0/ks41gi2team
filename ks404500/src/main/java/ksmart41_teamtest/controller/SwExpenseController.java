package ksmart41_teamtest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.SwExpense;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.SwExpenseService;
import ksmart41_teamtest.service.SwIsListService;

@Controller
@RequestMapping("/sw/accounting")
public class SwExpenseController {

	@Autowired
	public SwExpenseService swExpenseService;
	@Autowired
	private SwIsListService swIsListService;
	
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
		
		List<SwIsListCode> swIsListCode = swIsListService.getSwIsListCode();
		model.addAttribute("swIsListCode", swIsListCode);
		
		if(swExpensePayCode != null && !"".equals(swExpensePayCode)) {
			SwExpense swexpense = swExpenseService.selectSwExpense(swExpensePayCode);
			model.addAttribute("swexpense", swexpense);
		}
		model.addAttribute("title","비용 등록");
		return "sw/accounting/addExpense";
	}
	
	//[재천]비용 등록
	@PostMapping("/addExpense")
	public String addExpense(HttpSession session, SwExpense swExpense, Model model) {
		System.out.println("swExpenseController에서 받은 값 >>> " + swExpense);

		String memberId = (String) session.getAttribute("SWID");
		swExpense.setMemberId(memberId);
		
		swExpenseService.addExpense(swExpense);
		return "redirect:/sw/accounting/selectExpense";
	}
	
	//[재천]마감처리
	@RequestMapping("/finish")
	public @ResponseBody int finish (HttpSession session, SwExpense swExpense, Model model) {
		
		String memberIdFinish = (String) session.getAttribute("SWID");
		swExpense.setMemberIdFinish(memberIdFinish);
		
		swExpense.setSwExpenseFinish("Y");
		return swExpenseService.finishExpense(swExpense);
	}
	
	//[재천]비용 수정
	@PostMapping("/modifyExpense")
	public String modifyExpense(SwExpense swExpense) {
		swExpenseService.modifyExpense(swExpense);
		return "redirect:/sw/accounting/selectExpense";
	}
	
	//[재천]비용 수정
	@GetMapping("/modifyExpense")
	public String modifyExpense (@RequestParam(value = "swExpensePayCode", required = false) String swExpensePayCode,
			Model model) {
		System.out.println(swExpensePayCode + "컨트롤러에서 받아온 paycode");
		
		List<SwIsListCode> swIsListCode = swIsListService.getSwIsListCode();
		model.addAttribute("swIsListCode", swIsListCode);
		
		if(swExpensePayCode != null && !"".equals(swExpensePayCode)) {
			SwExpense selectSwExpense = swExpenseService.selectSwExpense(swExpensePayCode);
			model.addAttribute("selectSwExpense", selectSwExpense);
		}
		model.addAttribute("title","비용 수정");
		return "sw/accounting/modifyExpense";
	}
	
	//[재천]비용 삭제
	@RequestMapping("/deleteExpense")
	public @ResponseBody int deleteExpense(SwExpense swExpense) {
		return swExpenseService.deleteExpense(swExpense);
	}
}	


