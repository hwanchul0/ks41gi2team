package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Consumer;
import ksmart41_teamtest.service.ConsumerService;

@Controller
@RequestMapping("/shop/consumer")
public class ShopConsumerController {
	
	@Autowired
	private ConsumerService consumerService;
	
	
	
	//@GetMapping("/addConsumer")
	//public String addConsumer() {
	//	return "shop/consumer/addConsumer";
	//}
	
	
	@GetMapping("/selectConsumer")
	public String selectConsumer(Model model) {
		List<Consumer> consumerlist = consumerService.selectConsumerList();
		model.addAttribute("title", "소비자 조회");
		model.addAttribute("consumerlist", consumerlist);
		return "shop/consumer/selectConsumer";
	}
	
}