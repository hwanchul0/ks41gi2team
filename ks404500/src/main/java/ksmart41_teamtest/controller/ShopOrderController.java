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
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.dto.ShopAddAccounting;
import ksmart41_teamtest.dto.ShopAddPaymentCheck;
import ksmart41_teamtest.dto.ShopPaymentCheck;
import ksmart41_teamtest.service.OrderService;
import ksmart41_teamtest.service.ShopPaymentCheckService;

@Controller
@RequestMapping("/shop/order")
public class ShopOrderController {
	
	private static final Logger log = LoggerFactory.getLogger(ShopOrderController.class);
	@Autowired
	private OrderService orderService;
	@Autowired
	private ShopPaymentCheckService	shopPaymentCheckService;
	
	  //유성 쇼핑몰 결제 등록 화면에서 결제 내역 조회
	
	@GetMapping("/addPaymentCheck")
	public String showAddPaymentCheck(Model model,HttpSession session) {
		List<ShopAddPaymentCheck> shopAddPaymentCheck = shopPaymentCheckService.getAddShopAddPaymentCheck();

		
		model.addAttribute("shopAddPaymentCheck", shopAddPaymentCheck);

		
		String clientId = (String) session.getAttribute("SHOPID");
		session.setAttribute("SHOPID", clientId);
		log.info("addPaymentCheck memberId: {}", clientId);
		model.addAttribute("SHOPID", clientId);
		
		return "shop/order/addPaymentCheck";

	}
	
	 
	
	
	/*유성 쇼핑몰 결제상태 등록 post */
	@PostMapping("/addPaymentCheck")
	public String addPaymentCheck(ShopPaymentCheck shopPaymentCheck) {
		System.out.println("ShopOrderController에서 입력받은 값 " + shopPaymentCheck);
		shopPaymentCheckService.addPaymentCheck(shopPaymentCheck);
		return "redirect:/shop/order/addPaymentCheck";
	}

	/* 유성 쇼핑몰 주문내역 조회 */
	@GetMapping("/selectOrder")
	public String selectOrder(Model model) {
		List<Order> order = orderService.getOrder();
		model.addAttribute("title", "비용조회");
		model.addAttribute("order", order);
		System.out.println(order + "<--controller");
		return "shop/order/selectOrder";
	}
	
	/* 유성 쇼핑몰 결제상태 조회*/
	@GetMapping("/selectPaymentCheck")
	public String selectPaymentCheck(Model model) {
		List<ShopPaymentCheck> shopPaymentCheck = shopPaymentCheckService.getShopPaymentCheck();
		model.addAttribute("title", "결제상태조회");
		model.addAttribute("shopPaymentCheck", shopPaymentCheck);
		System.out.println(shopPaymentCheck + "<--controller");
		return "shop/order/selectPaymentCheck";
	}
	


	
	
	
}