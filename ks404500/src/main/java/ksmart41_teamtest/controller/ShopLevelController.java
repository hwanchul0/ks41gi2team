package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.ClientLevel;
import ksmart41_teamtest.service.ClientLevelService;

@Controller
@RequestMapping("/shop/level")
public class ShopLevelController {
	//의존성 주입
	@Autowired
	private ClientLevelService clientLevelService;
	@GetMapping("/addClientLevel")
	public String addClientLevel() {
		return "shop/level/addClientLevel";
	}
	
	/*유성 외부 직원 권한조회 */
	@GetMapping("/selectClientLevel")
	public String selectClientLevel(Model model) {
		List<ClientLevel> clientLevel = clientLevelService.getClientLevel();
		model.addAttribute("title", "외부권한조회");
		model.addAttribute("clientLevel", clientLevel);
		System.out.println(clientLevel + "<--controller");
		return "shop/level/selectClientLevel";
	}
	
}
