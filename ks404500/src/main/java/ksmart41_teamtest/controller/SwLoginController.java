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
public class SwLoginController {
	
	private MemberService memberService;
	private ClientService clientService;
	public SwLoginController(MemberService memberService, ClientService clientService) {
		this.memberService = memberService;
		this.clientService = clientService;
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		//return "redirect:/login";
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value="memberId", required = false)String memberId,
						@RequestParam(value="memberPw", required = false)String memberPw,
						@RequestParam(value="clientId", required = false)String clientId,
						@RequestParam(value="clientPw", required = false)String clientPw,
						HttpSession session) {
		System.out.println(memberId + " memberId입력값");
		System.out.println(clientId + " clientId입력값");
		if(memberId !=null && !"".equals(memberId) && memberPw!=null && !"".equals(memberPw)){
			Member member = memberService.MemberInfo(memberId);
			if(member != null && member.getMemberPw()!= null && memberPw.equals(member.getMemberPw())) {
				//로그인 비밀번호 일치 시 세션을 정보에 담음
				session.setAttribute("SID", memberId);
				session.setAttribute("SNAME", member.getMemberName());
				session.setAttribute("SLEVEL", member.getMemberLevelCode());
				return "redirect:/sw/index-sw";
			}
		}
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
		return "redirect:/login";
		}

	@GetMapping("/addMember")
	public String addMember() {
		return "sw/member/addMember";
	}
	
	@GetMapping("/addClient")
	public String addClient(Model model) {

		return "sw/client/addClient";
	}
}
