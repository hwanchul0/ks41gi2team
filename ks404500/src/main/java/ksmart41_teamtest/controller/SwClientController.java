package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sw/client")
public class SwClientController {
	
	@GetMapping("/selectClient")
	public String selectClient() {
		return "sw/client/selectClient";
	}
	
	@GetMapping("/addClient")
	public String addClient() {
		return "sw/client/addClient";
	}
}
