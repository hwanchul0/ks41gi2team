package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.MemberService;

@Controller
@RequestMapping("/sw/member")
public class SwMemberController {
	
	//의존성 주입
	@Autowired
	private MemberService memberService;
	
	//[재천]직원 등록
	@GetMapping("/addMember")
	public String addMember(Model model) {
		model.addAttribute("title", "SW직원 등록");
		return "sw/member/addMember";
	}
	
	//[재천]전체 직원 조회
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
	
	//[재천]멤버 삭제
	@RequestMapping ("/deleteMember")
	public @ResponseBody int deleteMember(Member member) {
		return memberService.deleteMember(member);
	}
	
	//[재천]멤버 수정
	@PostMapping("/modifyMember")
	public String modifyMember(Member member) {
		memberService.modifyMember(member);
		return "redirect:/sw/member/selectMember";
	}
	
	//[재천]멤버 수정
	@GetMapping("/modifyMember")
	public String modifyMember(@RequestParam(value = "memberId", required = false) String memberId,
								Model model) {
		System.out.println(memberId + "받아온 memberId (controller)");
		if(memberId != null && !"".equals(memberId)) {
			Member memberInfo = memberService.MemberInfo(memberId);
			model.addAttribute("memberInfo", memberInfo);
		}
		model.addAttribute("title", "회원수정");
		return "sw/member/modifyMember";
	}
	
	
}




