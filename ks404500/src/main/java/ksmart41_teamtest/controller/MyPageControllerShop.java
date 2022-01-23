package ksmart41_teamtest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.service.MyPageServiceShop;

@Controller
public class MyPageControllerShop {
	
	@Autowired
	private MyPageServiceShop myPageServiceShop;
	
	@GetMapping("/shop/client/myPage")
	public String selectSwMyPage(HttpSession session) {
		return "shop/client/myPage";
	}
	
	@GetMapping("/shop/client/modifyMyPage")
	public String modifyMyPage(@RequestParam (value = "shopMemberId", required = false)String shopMemberId,
			Model model) {
		
		
		ShopMember memberInfo = myPageServiceShop.MemberInfo(shopMemberId);
		model.addAttribute("memberInfo", memberInfo);
		model.addAttribute("title", "개인정보수정");
		return "shop/client/modifyMyPage";
	}
	
	@PostMapping("/shop/client/modifyMyPage")
	public String modifyMyPage(ShopMember shopMember) {
		//shopMember.setShopMemberState("Y");
		myPageServiceShop.modifyMyPage(shopMember);
		return "redirect:/";
	}
	
	@PostMapping("/shop/client/secession")
	public String secession(@RequestParam(value = "shopMemberId", required = false)String shopMemberId,
			ShopMember shopMember) {
		
		ShopMember status = myPageServiceShop.selectMemberStatus(shopMemberId);
		status.setShopMemberState("N");
		myPageServiceShop.modifystatus(shopMember);
		return "redirect:/";
	}
	
}
