package ksmart41_teamtest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {
	
	
	@GetMapping("/sw/member/myPage")
	public String selectSwMyPage(HttpSession session) {
		System.out.print("세션에 담겨있는 아이디 값 : " +  session.getAttribute("SWID"));
		System.out.print("세션에 담겨있는 레벨 값 : " +  session.getAttribute("SWLEVEL"));
		System.out.print("세션에 담겨있는 이름 값 : " +  session.getAttribute("SWNAME"));
		System.out.print("세션에 담겨있는 주소 값 : " +  session.getAttribute("SWADDR"));
		System.out.print("세션에 담겨있는 전화번호 값 : " +  session.getAttribute("SWPHONE"));
		System.out.print("세션에 담겨있는 등록일자 값 : " +  session.getAttribute("SWDATE"));

		return "sw/member/myPage";
	}
	
	@GetMapping("/shop/client/myPage")
	public String selectShopMyPage(HttpSession session) {
		System.out.print("세션에 담겨있는 아이디 값 : " +  session.getAttribute("SHOPOPID"));
		System.out.print("세션에 담겨있는 레벨 값 : " +  session.getAttribute("SHOPLEVEL"));
		System.out.print("세션에 담겨있는 이름 값 : " +  session.getAttribute("SHOPNAME"));
		System.out.print("세션에 담겨있는 주소 값 : " +  session.getAttribute("SHOPADDR"));
		System.out.print("세션에 담겨있는 전화번호 값 : " +  session.getAttribute("SHOPPHONE"));
		System.out.print("세션에 담겨있는 등록일자 값 : " +  session.getAttribute("SHOPDATE"));
		
		return "shop/client/myPage";
	}
}
