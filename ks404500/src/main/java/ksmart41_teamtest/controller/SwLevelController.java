package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.ClientLevel;
import ksmart41_teamtest.dto.MemberLevel;
import ksmart41_teamtest.service.ClientLevelService;
import ksmart41_teamtest.service.MemberLevelService;

@Controller
@RequestMapping("/sw/level")
public class SwLevelController {
	//의존성 주입 
	@Autowired
	private MemberLevelService memberLevelService;
	@Autowired
	private ClientLevelService clientLevelService;
	
	
	/*유성 내부 직원 권한 등록 */
	@GetMapping("/addMemberLevel")
	public String addMemberLevel() {
		return "sw/level/addMemberLevel";
	}
	
	//post방식 addMemberLevel
	@PostMapping("/addMemberLevel")
	public String addMemberLevel(MemberLevel memberLevel) {
		System.out.println("SwLevelController에서 입력받은 값 " + memberLevel);
		return null;
		
		//추가 

	}
	
	/*유성 내부 직원 권한조회 */
	@GetMapping("/selectMemberLevel")
	public String selectMemberLevel(Model model) {
		List<MemberLevel> memberLevel = memberLevelService.getMemberLevel();
		model.addAttribute("title", "내부권한조회");
		model.addAttribute("memberLevel", memberLevel);
		System.out.println(memberLevel + "<--controllder");
		return "sw/level/selectMemberLevel";
	}
	
	@GetMapping("/addClientLevel")
	public String addClientLevel() {
		return "sw/level/addClientLevel";
	}
	
	/*유성 외부 직원 권한조회 */
	@GetMapping("/selectClientLevel")
	public String selectClientLevel(Model model) {
		List<ClientLevel> clientLevel = clientLevelService.getClientLevel();
		model.addAttribute("title", "외부권한조회");
		model.addAttribute("clientLevel", clientLevel);
		System.out.println(clientLevel + "<--controller");
		return "sw/level/selectClientLevel";
	}
	
	
}