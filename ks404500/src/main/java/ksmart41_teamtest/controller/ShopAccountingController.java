package ksmart41_teamtest.controller;




import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ksmart41_teamtest.dto.ShopAddAccounting;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.ShopAcountingService;

@Controller
@RequestMapping("/shop/accounting")
public class ShopAccountingController {
	
	private static final Logger log = LoggerFactory.getLogger(ShopAccountingController.class);
	
	@Autowired
	private ShopAcountingService shopAcountingService;
	
	@GetMapping("/addExpense")
	public String addExpense() {
		return "shop/accounting/addExpense";
	}
	
	
	//유경 - 쇼핑몰 매출 등록화면에서 발행 대상 조회
	@GetMapping("/addIncome")
	public String showAddIncome(Model model,HttpSession session) {
		List<ShopAddAccounting> shopAddAccounting = shopAcountingService.getAddIncome();
		ShopAddAccounting shopAddIncomeCode = shopAcountingService.getAddIncomeCode();// 쇼핑몰 매출코드 증가
		
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
	
	@GetMapping("/addTotalAccounting")
	public String addTotalAccounting() {
		return "shop/accounting/addTotalAccounting";
	}
	
	@GetMapping("/selectExpense")
	public String selectExpense() {
		return "shop/accounting/selectExpense";
	}
	
	
	//쇼핑몰 매출 마감확인
	@PostMapping("/modifyIncome")
	public String ShopIncomeFinish(ShopAddAccounting shopAddAccounting) {
		 log.info("정보 : {}", shopAddAccounting );
		//계정사용여부수정
		 shopAcountingService.ShopIncomeFinish(shopAddAccounting);
		return "redirect:/shop/accounting/selectIncome";
	}
	
	//쇼핑몰 매출 마감확인
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
		List<ShopAddAccounting> shopAddAccounting = shopAcountingService.getSelectIncome();
		model.addAttribute("shopAddAccounting", shopAddAccounting);
		return "shop/accounting/selectIncome";
	}
	
	
	//유경 - 쇼핑몰 통합회계 조회
	@GetMapping("/selectTotalAccounting")
	public String selectTotalAccounting() {
		//Map<String, Object> expense = shopAcountingService.getSelectTotalAccounting();
		return "shop/accounting/selectTotalAccounting";
	}
	
	
}