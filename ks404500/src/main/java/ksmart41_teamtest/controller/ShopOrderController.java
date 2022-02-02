package ksmart41_teamtest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.dto.ShopAddPaymentCheck;
import ksmart41_teamtest.dto.ShopCategoryOrder;
import ksmart41_teamtest.dto.ShopPaymentCheck;
import ksmart41_teamtest.mapper.OrderMapper;
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
	@Autowired
	private OrderMapper orderMapper;
	
	
	//유경 - 상품코드 카테고리 등록
	@PostMapping("/addGoods")
	public String addShopGoods(ShopCategoryOrder shopCategoryOrder,HttpSession session) {

		//세션 아이디 가져오기
		String memberId = (String) session.getAttribute("SHOPID");
		session.setAttribute("shopMemberId", memberId);
		shopCategoryOrder.setMemberId(memberId);
		System.out.println("shopMemberId==============="+memberId );
		//카테 등록
		orderMapper.addShopGoods(shopCategoryOrder);
		return "redirect:/shop/order/addGoods";
		}


	//유경 - 상품코드 카테고리 등록
	@GetMapping("/addGoods")
	public String shopGoods(Model model) {
		//List<HashMap<String, Object>> shopBizInfo = orderMapper.getShopBizInfo();
		//model.addAttribute("shopBizInfo", shopBizInfo);
		return "shop/order/addGoods";
	}
	
	
	@PostMapping("/getBiz")
	public String addShopgetbIZ(Model model) {
		List<HashMap<String, Object>> shopBizInfo = orderMapper.getShopBizInfo();
		model.addAttribute("shopBizInfo", shopBizInfo);
		return "shop/order/getBiz";
	}
	
	
	  //유성 쇼핑몰 결제 등록 화면에서 결제 내역 조회
	
	@GetMapping("/addPaymentCheck")
	public String showAddPaymentCheck(Model model,HttpSession session) {
		List<ShopAddPaymentCheck> shopAddPaymentCheck = shopPaymentCheckService.getAddShopAddPaymentCheck();

		
		model.addAttribute("shopAddPaymentCheck", shopAddPaymentCheck);

		
		//세션 아이디 가져오기
	      String shopMemberId = (String) session.getAttribute("SHOPID");
	      session.setAttribute("shopMemberId", shopMemberId);
	      log.info("addPaymentCheck memberId: {}", shopMemberId);
	      model.addAttribute("shopMemberId", shopMemberId);
		
		return "shop/order/addPaymentCheck";

	}
	
	//유성 쇼핑몰 결제 등록
		@PostMapping("/addPaymentCheck")
		public String addPaymentCheck(ShopPaymentCheck shopPaymentCheck,HttpSession session) {
			
			//세션 아이디 가져오기
			String shopMemberId = (String) session.getAttribute("SHOPID");
			session.setAttribute("shopMemberId", shopMemberId);
			log.info("addIncome memberId: {}", shopMemberId);
			
			System.out.println("입력받은 값 : " + shopPaymentCheck);
			//System.out.println("입력받은 addIncomeCode : " + addIncomeCode);
			//String code = shopAddAccounting.getAddIncomeCode();
			//System.out.println("코드 code" + code);
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
	
	/* 유성 쇼핑몰 주문 취소(수정) */
	@PostMapping ("/modifyOrder")
	public String modifyOrder(Order order) {
		orderService.modifyOrder(order);
		return "redirect:/shop/order/selectOrder";
	}
	
	/* 유성 쇼핑몰 주문 취소(수정) */
	@GetMapping ("/modifyOrder")
	public String modifyOrder(@RequestParam(value = "shopOrderCode", required = false) String shopOrderCode,
								Model model) {
		Order getOrderList = orderService.getOrderList(shopOrderCode);
		//model.addAttribute("title", "사업장 수");
		model.addAttribute("getOrderList", getOrderList);
		System.out.println(shopOrderCode + "받아온 shopOrderCode (controller)");
		if(shopOrderCode != null && !"".equals(shopOrderCode)) {
			Order getOrder = orderService.getOrderList(shopOrderCode);
			model.addAttribute("getOrder", getOrder);
		}
		model.addAttribute("tilte", "주문내역 수정");
		return "shop/order/modifyOrder";
	}
	
	
	/* 유성 쇼핑몰 결제조회*/
	@GetMapping("/selectPaymentCheck")
	public String selectPaymentCheck(Model model) {
		List<ShopPaymentCheck> shopPaymentCheck = shopPaymentCheckService.getShopPaymentCheck();
		model.addAttribute("title", "결제상태조회");
		model.addAttribute("shopPaymentCheck", shopPaymentCheck);
		System.out.println(shopPaymentCheck + "<--controller");
		return "shop/order/selectPaymentCheck";
	}
	
	/* 유성 쇼핑몰 결제 삭제 */
	@RequestMapping ("/deletePaymentCheck")
	public @ResponseBody int deletePaymentCheck(ShopPaymentCheck shopPaymentCheck) {
		
		return shopPaymentCheckService.deletePaymentCheck(shopPaymentCheck);
	}
	
	/* 유성 쇼핑몰 결제 수정(paymentComplete) */
	@PostMapping ("/modifyPaymentCheck")
	public String modifyPaymentCheck(ShopPaymentCheck shopPaymentCheck) {
		shopPaymentCheckService.modifyShopPaymentCheck(shopPaymentCheck);
		return "redirect:/shop/order/selectPaymentCheck";
	}
	
	/*  유성 쇼핑몰 결제 수정(paymentComplete) */
	@GetMapping("/modifyPaymentCheck")
	public String modifyPaymentCheck(@RequestParam(value="shopPaymentCheckCode", required = false) String shopPaymentCheckCode
            ,Model model,  HttpServletResponse response,HttpServletRequest request) throws IOException {
		ShopPaymentCheck shopPaymentInfo = shopPaymentCheckService.getModifyPaymentCheck(shopPaymentCheckCode);
		List<ShopPaymentCheck> shopPaymentCheck = shopPaymentCheckService.getShopPaymentCheck();
		System.out.println(shopPaymentCheck);
		response.setContentType("text/html; charset=UTF-8");
		model.addAttribute("shopPaymentInfo", shopPaymentInfo);
		if(shopPaymentCheck != null && !"".equals(shopPaymentCheck) && "payWaiting".equals(shopPaymentInfo.getPaymentStateCode()) ) {
			model.addAttribute("shopPaymentCheck", shopPaymentCheck);
			shopPaymentInfo.getPaymentStateCode();

		}else if("payComplete".equals(shopPaymentInfo.getPaymentStateCode())){
            PrintWriter out = response.getWriter();
            out.println("<script>alert('수정할 수 없는 계정과목입니다.'); history.go(-1);</script>");
            out.flush();
            out.close();
		}
		return "shop/order/modifyPaymentCheck";
	}
	
}