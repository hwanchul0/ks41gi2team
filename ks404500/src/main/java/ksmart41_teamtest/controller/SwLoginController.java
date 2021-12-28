package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwLoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@GetMapping("/addClient")
	public String addClient() {
		return "sw/client/addClient";
	}
	
	@GetMapping("/addMember")
	public String addMember() {
		return "sw/member/addMember";
	}
}
