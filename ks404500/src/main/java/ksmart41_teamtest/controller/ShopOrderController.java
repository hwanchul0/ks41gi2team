package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/order")
public class ShopOrderController {
	
	@GetMapping("/addPaymentCheck")
	public String addPaymentCheck() {
		return "shop/order/addPaymentCheck";
	}
	
	@GetMapping("/selectOrder")
	public String selectOrder() {
		return "shop/order/selectOrder";
	}
	
	@GetMapping("/selectPaymentCheck")
	public String selectPaymentCheck() {
		return "shop/order/selectPaymentCheck";
	}
	
	
}