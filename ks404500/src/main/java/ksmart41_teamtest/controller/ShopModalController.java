package ksmart41_teamtest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.ShopModal;
import ksmart41_teamtest.service.ShopModalService;

@Controller
@RequestMapping("/shop/modal")
@ResponseBody
public class ShopModalController {
	
	private ShopModalService shopRequestService;
	
	public ShopModalController(ShopModalService shopRequestService) {
		this.shopRequestService = shopRequestService;
	}
	
	@GetMapping("/requestModal")
	@ResponseBody
	public String getRequestModal(Model model) {
		List<ShopModal> getRequestModal = shopRequestService.getRequestModal();
		System.out.println("requestModal 컨트롤러 접근 확인 ");
		System.out.println(getRequestModal);
		model.addAttribute("title", "모달화면");
		model.addAttribute("getRequestModal", getRequestModal);
		return "/shop/modal/requestModal";
	}
	
	/* json 방식
	 * @GetMapping(value="/json", produces = "application/json")
	 * 
	 * @ResponseBody public List<String> json(Model model) {
	 * model.addAttribute("title", "모달화면"); List<String> userList = new
	 * ArrayList<String>(); userList.add("홍길동"); userList.add("이순신"); return
	 * userList; }
	 */
	
	// 모달 가져올 컨트롤러
	@GetMapping("/getModal")
	public String getModal(Model model) {
		//model.addAttribute("title", "메인화면");
		return "getModal";
	}
	
}
