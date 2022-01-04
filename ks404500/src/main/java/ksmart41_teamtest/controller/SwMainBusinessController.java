package ksmart41_teamtest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.Business;
import ksmart41_teamtest.service.BusinessService;
import ksmart41_teamtest.dto.MainBusinessCode;
import ksmart41_teamtest.service.MainBusinessCodeService;

@Controller
@RequestMapping("/sw/business")
public class SwMainBusinessController {
	
	@Autowired
	private BusinessService businessService;
	@Autowired
	private MainBusinessCodeService mainBusinessCodeService;
	
	
	
	/* 유성 사업장 조회 */
	@GetMapping("/selectBusiness")
	public String selectBusiness(Model model) {
		List<Business> business = businessService.getBusiness();
		model.addAttribute("title", "사업장 조회");
		model.addAttribute("business", business);
		System.out.println(business + "<-- controller");
		return "sw/business/selectBusiness";
	}
	/* 유성 사업장 수정 */
	@PostMapping ("/modifyBusiness")
	public String modifyBusiness(Business business) {
		businessService.modifyBusiness(business);
		return "redirect:/sw/business/selectBusiness";
	}
	
	/* 유성 사업장 수정 */
	@GetMapping ("/modifyBusiness")
	public String modifyBusiness(@RequestParam(value = "clientId", required = false) String clientId,
								Model model) {
		System.out.println(clientId + "받아온 clientId (controller)");
		if(clientId != null && !"".equals(clientId)) {
			Business getBusiness = businessService.getBusiness(clientId);
			model.addAttribute("getBusiness", getBusiness);
		}
		model.addAttribute("tilte", "사업장 수정");
		return "sw/business/modifyBusiness";
	}
	/*유성 사업장 조회(상세보기) */
	
	/*유성 사업장 대표코드 등록 */
	@GetMapping("/addMainBusinessCode")
	public String addMainBusinessCode() {
		return "sw/business/addMainBusinessCode";
	}
	/* 유성 사업장 대표코드 조회 */
	@GetMapping("/selectMainBusinessCode")
	public String selectMainBusinessCode(Model model) {
		List<MainBusinessCode> mainBusinessCode = mainBusinessCodeService.getMainBusinessCode();
		model.addAttribute("title", "사업장 대표코드 조회");
		model.addAttribute("mainBusinessCode", mainBusinessCode);
		System.out.println(mainBusinessCode + "<-- controller");
		return "sw/business/selectMainBusinessCode";
	}
	
}