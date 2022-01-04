package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.service.OrderService;

@Controller
@RequestMapping("/shop/order")
public class ShopOrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/addPaymentCheck")
	public String addPaymentCheck() {
		return "shop/order/addPaymentCheck";
	}
	
	@GetMapping("/selectOrder")
	public String selectOrder(Model model) {
		List<Order> order = orderService.getOrder();
		model.addAttribute("title", "비용조회");
		model.addAttribute("order", order);
		System.out.println(order + "<--controller");
		return "shop/order/selectOrder";
	}
	
	@GetMapping("/selectPaymentCheck")
	public String selectPaymentCheck() {
		return "shop/order/selectPaymentCheck";
	}
	
	
}