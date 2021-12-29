package ksmart41_teamtest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Business;
import ksmart41_teamtest.service.BusinessService;

@Controller
@RequestMapping("/sw/business")
public class SwMainBusinessController {
	
	@Autowired
	private BusinessService businessService;
	
	
	@GetMapping("/addBusiness")
	public String addBusiness() {
		return "sw/business/addBusiness";
	}
	/* 유성 사업장 조회 */
	@GetMapping("/selectBusiness")
	public String selectBusiness(Model model) {
		List<Business> business = businessService.getBusiness();
		model.addAttribute("title", "사업장 조회");
		model.addAttribute("business", business);
		System.out.println(business + "<-- controller");
		return "sw/business/selectBusiness";
	}
	
	@GetMapping("/addMainBusinessCode")
	public String addMainBusinessCode() {
		return "sw/business/addMainBusinessCode";
	}
	
	@GetMapping("/selectMainBusinessCode")
	public String selectMainBusinessCode() {
		return "sw/business/selectMainBusinessCode";
	}
	
}