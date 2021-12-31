package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Client;
import ksmart41_teamtest.service.ClientService;

@Controller
@RequestMapping("/shop/client")
public class ShopClientController {
	
	//의존성 주입
	@Autowired
	private ClientService clientService;
	
	//[재천]회원 등록
	@GetMapping("/addClient")
	public String addClient(Model model) {
		model.addAttribute("title", "회원등록");
		return "shop/client/addClient";
	}
	
	//[재천]회원 조회
	@GetMapping("/selectClient")
	public String selectClient(Model model) {

		List<Client> clientList = clientService.selectClientList();
		model.addAttribute("title", "회원조회");
		model.addAttribute(clientList);
		
		return "shop/client/selectClient";
	}
	
	//post방식 addClient
	@PostMapping("/addClient")
	public String addClient(Client client) {
		System.out.println("shopclientController에서 받은 값" + client);
		
		//insert처리
		String clientId = client.getClientId();
		if(clientId != null && !"".equals(clientId)) {
			clientService.addClient(client);
		}
		return "redirect:/shop/client/selectClient";
	}
}