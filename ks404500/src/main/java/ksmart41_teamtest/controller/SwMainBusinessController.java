package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/business")
public class SwMainBusinessController {
	
	@GetMapping("/addBusiness")
	public String addBusiness() {
		return "sw/business/addBusiness";
	}
	
	@GetMapping("/selectBusiness")
	public String selectBusiness() {
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