package ksmart41_teamtest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.Client;
import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.ClientService;
import ksmart41_teamtest.service.MemberService;

@Controller
public class ShopLoginController {
	
	private ClientService clientService;
	public ShopLoginController(ClientService clientService) {
		this.clientService = clientService;
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
	public String login(@RequestParam(value="clientId", required = false)String clientId,
						@RequestParam(value="clientPw", required = false)String clientPw,
						HttpSession session) {
		System.out.println(clientId + " clientId입력값");
		if(clientId !=null && !"".equals(clientId) && clientPw!=null && !"".equals(clientPw)){
			Client client = clientService.ClientInfo(clientId);
			if(client != null && client.getClientId() != null && clientPw.equals(client.getClientPw())) {
				//로그인 비밀번호 일치 시 세션을 정보에 담음
				session.setAttribute("SHOPID", clientId);
				session.setAttribute("SHOPNAME", client.getClientName());
				return "redirect:/shop/index-shop";
				}
			}
		//로그인 불일치 시
		return "redirect:/Swlogin";
		}
	
	//회원가입시
	@GetMapping("/addClient")
	public String addClient(Model model) {
		model.addAttribute("title", "회원가입");
		return "shop/client/addClient";
	}
}
