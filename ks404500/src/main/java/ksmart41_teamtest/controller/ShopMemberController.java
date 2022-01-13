package ksmart41_teamtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.service.ShopMemberService;

@Controller
@RequestMapping("/shop/client")
public class ShopMemberController {
	
	//의존성 주입
	@Autowired
	private ShopMemberService shopMemberService;
	
	//[재천]회원 등록
	@GetMapping("/addClient")
	public String addShopMember(Model model) {
		model.addAttribute("title", "회원가입");
		return "shop/client/addClient";
	}
	
	//post방식 addClient
	@PostMapping("/addClient")
	public String addClient(ShopMember shopMember) {
		System.out.println("shopclientController에서 받은 값" + shopMember);
		
		//insert처리
		String shopMemberId = shopMember.getShopMemberId();
		if(shopMemberId != null && !"".equals(shopMemberId)) {
			shopMember.setBusinessLevelCode("user");
			shopMemberService.addShopMember(shopMember);
		}
		return "redirect:/shop/index-shop";
	}
	

}

