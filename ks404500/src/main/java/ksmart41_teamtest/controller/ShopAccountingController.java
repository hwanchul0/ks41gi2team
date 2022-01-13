
package ksmart41_teamtest.controller;




import java.util.List;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.Expense;
import ksmart41_teamtest.dto.ShopAddAccounting;

import ksmart41_teamtest.service.ExpenseService;
import ksmart41_teamtest.service.ShopAcountingService;

@Controller
@RequestMapping("/shop/accounting")
public class ShopAccountingController {
	
	private static final Logger log = LoggerFactory.getLogger(ShopAccountingController.class);
	
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
	public String showAddIncome(Model model,HttpSession session) {
		List<ShopAddAccounting> shopAddAccounting = shopAcountingService.getAddIncome();
		ShopAddAccounting shopAddIncomeCode = shopAcountingService.getAddIncomeCode();
		
		model.addAttribute("shopAddAccounting", shopAddAccounting);
		model.addAttribute("shopAddIncomeCode", shopAddIncomeCode);
		
		//세션 아이디 가져오기
		String clientId = (String) session.getAttribute("SHOPID");
		session.setAttribute("SHOPID", clientId);
		log.info("addIncome memberId: {}", clientId);
		model.addAttribute("SHOPID", clientId);
		
		//System.out.println(shopAddIncomeCode);
		return "shop/accounting/addIncome";
	}
	
	//유경 - 쇼핑몰 매출 등록
	@PostMapping("/addIncome")
	public String addIncome(ShopAddAccounting shopAddAccounting) {
		System.out.println("입력받은 값 : " + shopAddAccounting);
		//System.out.println("입력받은 addIncomeCode : " + addIncomeCode);
		//String code = shopAddAccounting.getAddIncomeCode();
		//System.out.println("코드 code" + code);
		shopAcountingService.addIncome(shopAddAccounting);

		return "redirect:/shop/accounting/addIncome";
	}
	
	//유경 - 쇼핑몰 통합매출회계  발행대상 조회
	@GetMapping("/addTotalAccounting")
	public String addTotalAccounting(Model model) {
		//통합회계 매출 등록
		List<ShopAddAccounting> totalIncome = shopAcountingService.selectByTotalIncome();
		model.addAttribute("totalIncome",totalIncome);
		return "shop/accounting/addTotalAccounting";
	}
	
	//유경 - 쇼핑몰 통합비용 회계  발행대상 조회
	@GetMapping("/addTotalAccountingExpense")
	public String addTotalAccountingExpense(Model model) {
		//통합회계 매입 등록
		List<ShopAddAccounting> totalExpense = shopAcountingService.selectByTotalExpense();
		model.addAttribute("totalExpense",totalExpense);
		return "shop/accounting/addTotalAccountingExpense";
	}
	
	//유경 - 쇼핑몰 통합매출 회계  발행대상 등록
	@PostMapping("/addTotalAccounting")
	public String addTotalAccountingByIncome(ShopAddAccounting shopAddAccounting) {
		shopAcountingService.addTotalAccountingByIncome(shopAddAccounting);
		return "redirect:/shop/accounting/addTotalAccounting";
	}
	
	//유경 - 쇼핑몰 통합비용 회계  발행대상 등록
	@PostMapping("/addTotalAccountingExpense")
	public String addTotalAccountingByExpense(ShopAddAccounting shopAddAccounting) {
		shopAcountingService.addTotalAccountingByExpense(shopAddAccounting);
		return "redirect:/shop/accounting/addTotalAccountingExpense";
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
	
	//유성 쇼핑몰 비용 마감확인
	@PostMapping("/modifyExpense")
	public String ShopExpenseFinish(Expense expense) {
			 log.info("정보 : {}", expense );
			//계정사용여부수정
			 expenseService.ShopExpenseFinish(expense);
			return "redirect:/shop/accounting/selectExpense";
		}
		
	// 유성 쇼핑몰 비용 마감확인
	@GetMapping("/modifyExpense")
	public String modifyShopExpense(@RequestParam(value="shopExpenseCode", required = false) String shopExpenseCode
	            ,Model model) {
			Expense finish = expenseService.getModifyShopExpense(shopExpenseCode);
			model.addAttribute("finish", finish);
			log.info("finish 데이터 확인 ", finish);
			return "/shop/accounting/modifyExpense";
		}
	//유성 - 쇼핑몰 비용 삭제
	@RequestMapping ("/deleteExpense")
	public @ResponseBody int deleteExpense(Expense expense) {
		return expenseService.deleteExpense(expense);
	}
	
	// 유경 쇼핑몰 매출 마감확인
	@PostMapping("/modifyIncome")
	public String ShopIncomeFinish(ShopAddAccounting shopAddAccounting) {
		 log.info("정보 : {}", shopAddAccounting );
		//계정사용여부수정
		 shopAcountingService.ShopIncomeFinish(shopAddAccounting);
		return "redirect:/shop/accounting/selectIncome";
	}
	
	// 유경 쇼핑몰 매출 마감확인
	@GetMapping("/modifyIncome")
	public String modifyShopIncome(@RequestParam(value="shopIncomeCode", required = false) String shopIncomeCode
            ,Model model) {
		ShopAddAccounting finish = shopAcountingService.getModifyShopIncome(shopIncomeCode);
		model.addAttribute("finish", finish);
		log.info("finish 데이터 확인 ", finish);
		return "/shop/accounting/modifyIncome";
	}
	
	
	
	//유경 - 쇼핑몰 매출조회
	@GetMapping("/selectIncome")
	public String selectIncome(Model model) {
		//쇼핑몰 매출 목록 조회
		List<ShopAddAccounting> shopAddAccounting = shopAcountingService.getSelectIncome();
		model.addAttribute("shopAddAccounting", shopAddAccounting);
		log.info("shopAddAccounting===========",shopAddAccounting);
		//쇼핑몰 매출 차트 조회
		ShopAddAccounting incomeChart = shopAcountingService.getIncomeChart();
		model.addAttribute("incomeChart", incomeChart);
		//System.out.println("incomeChart =============="+incomeChart);
		return "shop/accounting/selectIncome";
	}
	
	//유경 - 쇼핑몰 매출삭제
	@RequestMapping ("/deleteIncome")
	public @ResponseBody int deleteIncome(ShopAddAccounting shopAddAccounting) {
		log.info("delete shop매출=========",shopAddAccounting);
		return shopAcountingService.deleteIncome(shopAddAccounting);
	}
	
	//유경 - 쇼핑몰 통합회계 조회
	@GetMapping("/selectTotalAccounting")
	public String selectTotalAccounting(Model model) {
				return "shop/accounting/selectTotalAccounting";
		}
	
}