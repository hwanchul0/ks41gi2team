package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/code")
public class ShopCodeController {
	
	@GetMapping("/addPaymentState")
	public String addPaymentState() {
		return "shop/code/addPaymentState";
	}
	
	@GetMapping("/selectPaymentState")
	public String selectPaymentState() {
		return "shop/code/selectPaymentState";
	}
	
	
}