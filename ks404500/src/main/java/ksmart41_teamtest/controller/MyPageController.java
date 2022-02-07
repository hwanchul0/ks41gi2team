package ksmart41_teamtest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.MyPageService;

@Controller
public class MyPageController {

	@Autowired
	private MyPageService myPageService;

	@GetMapping("/sw/member/myPage")
	public String selectSwMyPage(HttpSession session) {
		System.out.print("세션에 담겨있는 아이디 값 : " + session.getAttribute("SWID"));
		System.out.print("세션에 담겨있는 레벨 값 : " + session.getAttribute("SWLEVEL"));
		System.out.print("세션에 담겨있는 이름 값 : " + session.getAttribute("SWNAME"));
		System.out.print("세션에 담겨있는 주소 값 : " + session.getAttribute("SWADDR"));
		System.out.print("세션에 담겨있는 전화번호 값 : " + session.getAttribute("SWPHONE"));
		System.out.print("세션에 담겨있는 등록일자 값 : " + session.getAttribute("SWDATE"));
		return "sw/member/myPage";
	}

	// 회원탈퇴
	@PostMapping("/sw/member/secession")
	public String secession(@RequestParam(value = "memberId", required = false) String memberId, Member member) {
		Member status = myPageService.selectMemberStatus(memberId);
		status.setMemberStatus("N");
		myPageService.modifystatus(member);
		return "redirect:/";
	}

	@GetMapping("/sw/member/modifyMyPage")
	public String modifyMyPage(@RequestParam(value = "memberId", required = false) String memberId, Model model) {

		System.out.println(memberId + "memberId받아옴");
		Member memberInfo = myPageService.MemberInfo(memberId);
		model.addAttribute("memberInfo", memberInfo);
		model.addAttribute("title", "개인정보수정");
		
		/*
		String memberfileName = "";
		Member fileName = myPageService.selectMemberProfile(memberfileName);
		System.out.println(fileName + "테스트!");
		String imgPath = "/profile/"; // img경로
		String profile = imgPath + fileName;
		model.addAttribute("profile", profile); */
		
		return "sw/member/modifyMyPage";
	}

	@PostMapping("/sw/member/modifyMyPage")
	public String update(MultipartFile multipartFile, Member member, HttpServletRequest request) {
		System.out.println("post Controller 확인");
		System.out.println(multipartFile.getSize() + "test재천");
		member.setMemberStatus("Y");
		myPageService.modifyMyPage(multipartFile, member, request);
		return "redirect:/";
	}

}
