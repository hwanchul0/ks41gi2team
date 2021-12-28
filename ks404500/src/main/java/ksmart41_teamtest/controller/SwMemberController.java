package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.MemberService;

@Controller
@RequestMapping("/sw/member")
public class SwMemberController {
	
	//의존성 주입
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/addMember")
	public String addMember() {
		return "sw/member/addMember";
	}
	
	//멤버조회
	@GetMapping("/selectMember")
	public String selectMember(Model model) {
		List<Member> memberList = memberService.selectMemberList();
		
		model.addAttribute("title", "SW회원 조회");
		model.addAttribute("memberList", memberList);
		
		return "sw/member/selectMember";
	}
	
	//post방식 addMember
	@PostMapping("/addMember")
	public String addMember(Member member) {
		System.out.println("SwMemberConetoller에서 입력받은 값 " + member);
		
		//insert처리
		String memberId = member.getMemberId();
		if(memberId != null && !"".equals(memberId)) {
			member.setMemberLevelCode("SW2");
			memberService.addMember(member);
		}
		return "redirect:/sw/member/selectMember";
	}
	
}




