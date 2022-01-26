package ksmart41_teamtest.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.mapper.ShopIndexMapper;
import ksmart41_teamtest.mapper.SwIndexMapper;


@Controller
public class MainController {
	
	@Autowired
	private SwIndexMapper swIndexMapper;
	@Autowired
	private ShopIndexMapper shopIndexMapper;

	// main index
	@GetMapping("/")
	public String mainIndex(HttpSession session) {
		session.invalidate();

		return "main-index2";
	}
	
	@GetMapping("/main-index2")
	public String mainIndex2(HttpSession session) {
		session.invalidate();
		return "main-index";
	}

	//유경- sw개발사 메인 페이지
	@GetMapping("/sw/index-sw")
	public String indexSw(Model model) {
		model.addAttribute("title", "SW메인페이지");
		//유경 인덱스
		//공급중인 사업장 수 
		ServicePayment service = swIndexMapper.indexSwGetServiceAmount();
		model.addAttribute("service", service);
		
		//서비스 결제대기
		HashMap<String, Object> wating = swIndexMapper.indexSwGetWatingAmount();
		//System.out.println("wating==============="+wating);
		model.addAttribute("wating", wating);
		
		//서비스 회원수
		HashMap<String, Object> client = swIndexMapper.indexSwGeClientAmount();
		model.addAttribute("client", client);
		//System.out.println("client======"+client);
		
		//서비스 매출 퍼센트
		List<HashMap<String, Object>> percent = swIndexMapper.indexSwGeServicePercent();
		model.addAttribute("percent", percent);
		//System.out.println("percent======"+percent);



		return "sw/index-sw";
	}

	//유경- 쇼핑몰 메인 페이지
	@GetMapping("/shop/index-shop")
	public String indexShop(Model model) {
		model.addAttribute("title", "Shop메인페이지");
		//미배송건수
		HashMap<String, Object> shipment = shopIndexMapper.indexShopGetSipment();
		model.addAttribute("shipment", shipment);
		
		//결제대기
		HashMap<String, Object> waiting = shopIndexMapper.indexShopGetWatingPayment();
		model.addAttribute("waiting", waiting);
		
		//일주일간 주문건수
		HashMap<String, Object> week = shopIndexMapper.indexShopGetWeekOrder();
		model.addAttribute("week", week);
		
		//일주일 날짜
		HashMap<String, Object> period = shopIndexMapper.indexShopGetPeriod();
		model.addAttribute("period", period);
		
		//주문 순서 매출 퍼센트
		List<HashMap<String, Object>> percent = shopIndexMapper.indexShopGetPercent();
		model.addAttribute("percent", percent);
		
		
		return "shop/index-shop";
	}


}