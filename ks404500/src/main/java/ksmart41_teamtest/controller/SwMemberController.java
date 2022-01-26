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
import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.service.MemberService;
import ksmart41_teamtest.service.ShopMemberService;

@Controller
@RequestMapping("/sw")
public class SwMemberController {
	
	//의존성 주입
	@Autowired
	private MemberService memberService;
	@Autowired
	private ShopMemberService shopMemberService;
	
	//[재천]직원 등록
	@GetMapping("/member/addMember")
	public String addMember(Model model) {
		model.addAttribute("title", "SW직원 등록");
		return "sw/member/addMember";
	}
	
	//[재천]전체 직원 조회
	@GetMapping("/member/selectMember")
	public String selectMember(Model model) {
		List<Member> memberList = memberService.selectMemberList();
		
		model.addAttribute("title", "SW회원 조회");
		model.addAttribute("memberList", memberList);
		
		return "sw/member/selectMember";
	}
	
	//post방식 addMember
	@PostMapping("/member/addMember")
	public String addMember(Member member) {
		System.out.println("SwMemberConetoller에서 입력받은 값 " + member);
		
		//insert처리
		String memberId = member.getMemberId();
		if(memberId != null && !"".equals(memberId)) {
			member.setMemberStatus("Y");
			member.setMemberLevelCode("SW2");
			memberService.addMember(member);
		}
		return "redirect:/sw/index-sw";
	}
	
	//[재천]멤버 삭제
	@RequestMapping ("/member/deleteMember")
	public @ResponseBody int deleteMember(Member member) {
		return memberService.deleteMember(member);
	}
	
	//[재천]멤버 수정
	@PostMapping("/member/modifyMember")
	public String modifyMember(Member member) {
		memberService.modifyMember(member);
		return "redirect:/sw/member/selectMember";
	}
	
	//[재천]멤버 수정
	@GetMapping("/member/modifyMember")
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
	
	//[재천] 중복체크
	@PostMapping("/member/idCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam (value="memberId", required = false) String memberId) {
		boolean idCheckResult = false;
		int idCheck = memberService.idCheck(memberId);
		
		if(idCheck > 0) {
			idCheckResult = true;
		}
		return idCheckResult;
	}
	
	//[재천]회원 조회
	@GetMapping("/client/selectClient")
	public String selectClient(Model model) {

		List<ShopMember> shopmemberlist = shopMemberService.selectShopMemberList();
		model.addAttribute("title", "회원조회");
		model.addAttribute("shopmemberlist", shopmemberlist);
		
		return "sw/client/selectClient";
	}
	
	/*
	 * client 부분~~~
	 */
	
	//[재천]외부회원 수정!
	@GetMapping("/client/modifyClient")
	public String modifyClientMember(@RequestParam(value = "shopMemberId", required = false)String shopMemberId,
			Model model) {
		System.out.println("modifyMemberController 값" + shopMemberId);
		if(shopMemberId != null && !"".equals(shopMemberId)) {
			ShopMember shopMemberInfo = shopMemberService.ShopMemberInfo(shopMemberId);
			model.addAttribute("shopMemberInfo", shopMemberInfo);
		}
		model.addAttribute("title", "회원 수정");
		return "sw/client/modifyClient";
	}
	
	//[재천]외부회원 수정
	@PostMapping("/client/modifyClient")
	public String modifyClientMember(ShopMember shopMember) {
		shopMemberService.modifyClientMember(shopMember);
		return "redirect:/sw/client/selectClient";
	}
	//[재천]외부회원 삭제
	@RequestMapping ("/client/deleteClient")
	public @ResponseBody int deleteClient(ShopMember shopMember) {
		return shopMemberService.deleteClient(shopMember);
	}
}


