package ksmart41_teamtest.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.service.ShopMemberService;

@Controller
public class ShopLoginController {
	
	private ShopMemberService shopMembeService;
	public ShopLoginController(ShopMemberService shopMembeService) {
		this.shopMembeService = shopMembeService;
	}

	@GetMapping("/Shoplogin")
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		return "login";
	}
	
	@GetMapping("/Shoplogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/Shoplogin")
	public String login(@RequestParam(value="shopMemberId", required = false)String shopMemberId,
						@RequestParam(value="shopMemberPw", required = false)String shopMemberPw,
						HttpServletResponse response,
						HttpSession session) throws IOException {
		System.out.println(shopMemberId + " shopMemberId입력값");
		System.out.println(shopMemberPw + " shopMemberPw입력값");
			if(shopMemberId != null && !"".equals(shopMemberId) && shopMemberPw != null && !"".equals(shopMemberPw)){
				ShopMember shopmember = shopMembeService.ShopMemberInfo(shopMemberId);
				if(shopmember != null && shopmember.getShopMemberId() != null && shopMemberPw.equals(shopmember.getShopMemberPw())) {
					ShopMember state = shopMembeService.selectShopMemberState(shopMemberId);
					String shopState = state.getShopMemberState();
					String resultY = "Y";
					if(shopState.equals(resultY)) {
					//로그인 비밀번호 일치 시 세션을 정보에 담음
					session.setAttribute("SHOPID", shopMemberId);
					session.setAttribute("SHOPNAME", shopmember.getShopMemberName());
					session.setAttribute("SHOPEMAIL", shopmember.getShopMemberEmail());
					session.setAttribute("SHOPADDR", shopmember.getShopMemberAddr());
					session.setAttribute("SHOPDATE", shopmember.getShopMemberReg());
					session.setAttribute("SHOPPHONE", shopmember.getShopMemberPhone());
					session.setAttribute("SHOPLEVEL", shopmember.getBusinessLevelCode());
					return "redirect:/shop/index-shop";
				}
			}
		}
		//로그인 불일치 시
		String SwLogin = "/Swlogin";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter(); writer.println("<script>alert('아이디 혹은 패스워드를 확인하세요'); location.href='"+SwLogin+"';</script>");
		writer.close();
		return "redirect:/Swlogin";
		}
	
	//회원가입시
	@GetMapping("/addClient")
	public String addClient(Model model) {
		model.addAttribute("title", "회원가입");
		return "shop/client/addClient";
	}
}
