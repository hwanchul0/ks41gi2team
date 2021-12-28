package ksmart41_teamtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Client;
import ksmart41_teamtest.service.ClientService;

@Controller
@RequestMapping("/sw/client")
public class SwClientController {
	
	//의존성 주입
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/addClient")
	public String addClient() {
		return "sw/client/addClient";
	}
	
	@GetMapping("/selectClient")
	public String selectClient() {
		return "sw/client/selectClient";
	}

	@PostMapping("/addClient")
	public String addClient(Client client) {
		System.out.println("SwClientController에서 받은 값 : " + client);
		//insert처리
		String clientId = client.getClientId();
		if(clientId != null && !"".equals(clientId)) {
			client.setBusinessLevelCode("user");
			clientService.addClient(client);
		}
		return "redirect:/sw/client/selectClient";
	}
}
