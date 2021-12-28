package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/member")
public class SwMemberController {
	
	@GetMapping("/addMember")
	public String addMember() {
		return "sw/member/addMember";
	}
	
	@GetMapping("/selectMember")
	public String selectMember() {
		return "sw/member/selectMember";
	}
	
}