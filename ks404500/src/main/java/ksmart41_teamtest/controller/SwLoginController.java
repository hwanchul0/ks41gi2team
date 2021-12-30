package ksmart41_teamtest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.MemberService;

@Controller
public class SwLoginController {
	
	private MemberService memberService;
	public SwLoginController(MemberService memberService) {
		this.memberService = memberService;
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
		return "redirect:/sw/index-sw";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value="memberId", required = false)String memberId,
						@RequestParam(value="memberPw", required = false)String memberPw,
						HttpSession session) {
		System.out.println(memberId + " 입력한아이디1");
		System.out.println(memberPw + " 입력한 패스워드1");
		if(memberId !=null && !"".equals(memberId) && memberPw!=null && !"".equals(memberPw)){
			Member member = memberService.MemberInfo(memberId);
			if(member != null && member.getMemberPw()!= null && memberPw.equals(member.getMemberPw())) {
				//로그인 비밀번호 일치 시 세션을 정보에 담음
				System.out.println(memberId + " 로그인 비밀번호 일치 / ID");
				System.out.println(memberPw + " 로그인 비밀번호 일치  / PW");
				session.setAttribute("SID", memberId);
				session.setAttribute("SNAME", member.getMemberName());
				session.setAttribute("SLEVEL", member.getMemberLevelCode());
				return "redirect:/sw/index-sw";
			}
		}
		//로그인 불일치 시
		System.out.println(memberId + " 입력한아이디 불일치");
		System.out.println(memberPw + " 입력한 패스워드 불일치");
		return "redirect:/login";
	}
	
	@GetMapping("/addMember")
	public String addMember() {
		return "sw/member/addMember";
	}
	
	@GetMapping("/addClient")
	public String addClient() {
		return "sw/client/addClient";
	}
}
