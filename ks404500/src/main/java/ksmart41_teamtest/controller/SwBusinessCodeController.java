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

import ksmart41_teamtest.dto.BusinessCode;
import ksmart41_teamtest.service.BusinessCodeService;

@Controller
@RequestMapping("/sw/code")
public class SwBusinessCodeController {
	
	//의존성
	@Autowired
	private BusinessCodeService businessCodeService;
	
	//[재천]거래처 구분 코드 등록
	@GetMapping("/addBusinessCode")
	public String addBusinessCode(Model model) {
		model.addAttribute("title", "SW거래처 구분 코드 등록");
		return "sw/code/addBusinessCode";
	}

	//[재천]거래처 구분 코드 등록
	@PostMapping("/addBusinessCode")
	public String addBusinessCode(BusinessCode businessCode) {
		businessCodeService.addBusinessCode(businessCode);
		return "redirect:/sw/code/selectBusinessCode";
	}
	
	//[재천]거래처 구분 코드 조회
	@GetMapping("/selectBusinessCode")
	public String selectBusinessCode(Model model) {
		List<BusinessCode> businessCodeList = businessCodeService.selectBusinessCodeList();
		
		model.addAttribute("title", "SW거래처 구분 코드 조회");
		model.addAttribute("businessCodeList", businessCodeList);
		
		return "sw/code/selectBusinessCode";
	}
	
	@GetMapping("/modifyBusinessCode")
	public String modifyBusinessCode(@RequestParam(value = "businessCode", required = false)String businessCode,
										Model model) {
		if(businessCode != null && !"".equals(businessCode)) {
			BusinessCode selectBusinessCodeInfo = businessCodeService.selectBusinessCodeInfo(businessCode);
			model.addAttribute("selectBusinessCodeInfo", selectBusinessCodeInfo);
		}
		model.addAttribute("title", "거래처 구분 코드 수정");
		return "sw/code/modifyBusinessCode";
	}
	
	@PostMapping("/modifyBusinessCode")
	public String modifyBusinessCode(BusinessCode businesscode) {
		businessCodeService.modifyBusinessCode(businesscode);
		return "redirect:/sw/code/selectBusinessCode";
	}
	
	@RequestMapping("/deleteBusinessCode")
	public @ResponseBody int deleteBusinessCode(BusinessCode businessCode){
		return businessCodeService.deleteBusinessCode(businessCode);
	}
	
}
