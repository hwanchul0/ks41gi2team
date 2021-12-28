package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/member")
public class ShopMemberController {
	
	@GetMapping("/addMember")
	public String addMember() {
		return "shop/member/addMember";
	}
	
	@GetMapping("/selectMember")
	public String selectMember() {
		return "shop/member/selectMember";
	}
	
}