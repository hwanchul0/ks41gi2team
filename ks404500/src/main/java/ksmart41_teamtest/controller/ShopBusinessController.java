package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/business")
public class ShopBusinessController {
	
	@GetMapping("/addBusinessInfo")
	public String addBusinessInfo() {
		return "shop/business/addBusinessInfo";
	}
	
	@GetMapping("/selectBusinessInfo")
	public String selectBusinessInfo() {
		return "shop/business/selectBusinessInfo";
	}
	
}