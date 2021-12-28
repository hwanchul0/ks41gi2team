package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/consumer")
public class ShopConsumerController {
	
	@GetMapping("/addConsumer")
	public String addConsumer() {
		return "shop/consumer/addConsumer";
	}
	
	@GetMapping("/selectConsumer")
	public String selectConsumer() {
		return "shop/consumer/selectConsumer";
	}
	
}