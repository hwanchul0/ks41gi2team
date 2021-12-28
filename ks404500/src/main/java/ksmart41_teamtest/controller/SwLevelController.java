package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/level")
public class SwLevelController {
	
	@GetMapping("/addMemberLevel")
	public String addMemberLevel() {
		return "sw/level/addMemberLevel";
	}
	
	@GetMapping("/selectMemberLevel")
	public String selectMemberLevel() {
		return "sw/level/selectMemberLevel";
	}
	
	@GetMapping("/addClientLevel")
	public String addClientLevel() {
		return "sw/level/addClientLevel";
	}
	
	@GetMapping("/selectClientLevel")
	public String selectClientLevel() {
		return "sw/level/selectClientLevel";
	}
	
}