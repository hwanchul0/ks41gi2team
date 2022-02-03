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

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.MemberService;

@Controller
public class SwLoginController {
	
	private MemberService memberService;
	public SwLoginController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/Swlogin")
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		return "login";
	}
	
	@GetMapping("/Swlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/Swlogin")
	public String login(@RequestParam(value="memberId", required = false)String memberId,
						@RequestParam(value="memberPw", required = false)String memberPw,
						HttpServletResponse response,
						HttpSession session) throws IOException {
		System.out.println(memberId + " memberId입력값");
			if(memberId != null && !"".equals(memberId) && memberPw != null && !"".equals(memberPw)){
				Member member = memberService.MemberInfo(memberId);
				if(member != null && member.getMemberPw()!= null && memberPw.equals(member.getMemberPw())) {
					Member status = memberService.selectMemberStatus(memberId);
					String memberStatus = status.getMemberStatus();
					String resultY = "Y";
						if(memberStatus.equals(resultY)) {
						//로그인 비밀번호 일치 시 세션을 정보에 담음
						session.setAttribute("SWID", memberId);
						session.setAttribute("SWNAME", member.getMemberName());
						session.setAttribute("SWLEVEL", member.getMemberLevelCode());
						session.setAttribute("SWADDR", member.getMemberAddr());
						session.setAttribute("SWEMAIL", member.getMemberEmail());
						session.setAttribute("SWDATE", member.getMemberRegDate());
						session.setAttribute("SWPHONE", member.getMemberPhone());
						return "redirect:/sw/index-sw";
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
	@GetMapping("/addMember")
	public String addMember(Model model) {
		model.addAttribute("title", "직원가입");
		return "sw/member/addMember";
	}
}
