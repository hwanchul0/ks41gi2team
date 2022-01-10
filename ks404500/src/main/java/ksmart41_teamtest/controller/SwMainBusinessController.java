package ksmart41_teamtest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
	/* 유성 사업장 전체 조회 */
	@GetMapping("/selectBusiness")
	public String selectBusiness(Model model) {
		List<Business> business = businessService.getBusiness();
		model.addAttribute("title", "사업장 조회");
		model.addAttribute("business", business);
		System.out.println(business + "<-- controller");
		return "sw/business/selectBusiness";
	}
	/* 유성 사업장 조회 상세페이지 */
	@PostMapping("/detailBusiness")
	public String getDetailBusinessList(String clientId)	{
		businessService.getDetailBusinessList(clientId);
		
		return "redirect:sw/business/detailBusiness";
	}
	
	@GetMapping("/detailBusiness")
	public String getDetailBusinessList(@RequestParam(value="clientId", required=false) String clientId
														,Model model) {
		Business getDetailBusinessList = businessService.getDetailBusinessList(clientId);
		model.addAttribute("title", "사업장 조회 상세페이지");
		model.addAttribute("getDetailBusinessList", getDetailBusinessList);
		
		return "sw/business/detailBusiness";
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
			Business getBusiness = businessService.getDetailBusinessList(clientId);
			model.addAttribute("getBusiness", getBusiness);
		}
		model.addAttribute("tilte", "사업장 수정");
		return "sw/business/modifyBusiness";
	}
	/* 유성 사업장 삭제  */
	@RequestMapping ("/deleteBusiness")
	public @ResponseBody int deleteBusiness(Business business) {
		return businessService.deleteBusiness(business);
	}
	
	/*유성 사업장 대표코드 등록get */
	@GetMapping("/addMainBusinessCode")
	public String addMainBusinessCode() {
		return "sw/business/addMainBusinessCode";
	}
	
	/*유성 사업장 대표코드 등록 post */
	@PostMapping("/addMainBusinessCode")
	public String addMainBusinessCode(MainBusinessCode mainBusinessCode) {
	System.out.println("SwMainBusinessController에서 입력받은 값" + mainBusinessCode);
		mainBusinessCodeService.addMainBusinessCode(mainBusinessCode);
		return	"redirect:/sw/business/addMainBusinessCode";
	}
	
	/* 유성 사업장 대표코드 전체 조회 */
	@GetMapping("/selectMainBusinessCode")
	public String selectMainBusinessCode(Model model) {
		List<MainBusinessCode> mainBusinessCode = mainBusinessCodeService.getMainBusinessCode();
		model.addAttribute("title", "사업장 대표코드 조회");
		model.addAttribute("mainBusinessCode", mainBusinessCode);
		System.out.println(mainBusinessCode + "<-- controller");
		return "sw/business/selectMainBusinessCode";
	}
	

	
	/* 유성 사업장 대표코드 수정 */
	@PostMapping ("/modifyMainBusinessCode")
	public String modifyMainBusinessCode(MainBusinessCode mainBusinessCode) {
		mainBusinessCodeService.modifyMainBusinessCode(mainBusinessCode);
		return "redirect:/sw/business/selectMainBusinessCode";
	}
	
	
	/* 유성 사업장 대표코드 수정 */
	@GetMapping	("/modifyMainBusinessCode")
	public String modifyMainBusinessCode(@RequestParam(value = "mainBusinessCode", required = false) String mainBusinessCode,
										Model model)	{
		System.out.println(mainBusinessCode + "받아온 mainBusinessCode (controller)");
		if(mainBusinessCode != null && !"".equals(mainBusinessCode))	{
			MainBusinessCode getMainBusinessCode = mainBusinessCodeService.MainBusinessCodeInfo(mainBusinessCode);
			model.addAttribute("getMainBusinessCode", getMainBusinessCode);
		}
		model.addAttribute("title", "사업장 대표코드 수정");
		return "sw/business/modifyMainBuisnessCode";
	}
	
}