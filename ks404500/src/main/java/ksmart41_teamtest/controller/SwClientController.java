package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Client;
import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.service.ClientService;

@Controller
@RequestMapping("/sw/client")
public class SwClientController {
	
	//의존성 주입
	@Autowired
	private ClientService clientService;

	//[재천]외부 회원 등록 GET
	@GetMapping("/addClient")
	public String addClient(Model model) {
		model.addAttribute("title", "회원 등록");
		return "sw/client/addClient";
	}
	
	//[재천]외부 회원 전체 조회
	@GetMapping("/selectClient")
	public String selectClient(Model model) {
		List<Client> clientList = clientService.selectClientList();
		
		model.addAttribute("title", "회원 조회");
		model.addAttribute("clientList", clientList);
		return "sw/client/selectClient";
	}
	
	//[재천]외부 회원 등록 POST
	@PostMapping("/addClient")
	public String addClient(Client client) {
		System.out.println(client + " : SwClientControoler에서 받아온 client값");
		
		String clientId = client.getClientId();
		if(clientId != null && !"".equals(clientId)) {
			clientService.addClient(client);
		}
		return "redirect:/sw/client/selectClient";
	}
}
