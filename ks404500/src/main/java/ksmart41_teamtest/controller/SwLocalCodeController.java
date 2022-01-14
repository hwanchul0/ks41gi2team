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

import ksmart41_teamtest.dto.LocalCode;
import ksmart41_teamtest.service.LocalCodeService;

@Controller
@RequestMapping("/sw/code")
public class SwLocalCodeController {
	
	@Autowired
	private LocalCodeService localCodeService;
	
	//[재천]지역 코드 등록
	@GetMapping("/addLocalCode")
	public String addLocalCode(Model model) {
		model.addAttribute("title", "SW지역코드 등록");
		return "sw/code/addLocalCode";
	}
	
	//[재천]지역 코드 등록
	@PostMapping("/addLocalCode")
	public String addLocalCode(LocalCode localCode) {
		//insert처리
		String localcode = localCode.getLocalCode();
		if(localcode != null && !"".equals(localcode)) {
			localCodeService.addLocalCode(localCode);
		}
		return "redirect:/sw/code/selectLocalCode";
	}
	
	//[재천]지역 코드 조회
	@GetMapping("/selectLocalCode")
	public String selectLocalCode(Model model) {
		List<LocalCode> localcodeList = localCodeService.selectLocalCodeList();
		model.addAttribute("title", "SW지역코드 조회");
		model.addAttribute("localcodeList", localcodeList);
		return "sw/code/selectLocalCode";
	}
	
	//[재천] 지역 코드 수정
	@GetMapping("/modifyLocalCode")
	public String modifyLocalCode(@RequestParam(value="localCode", required = false)String localCode,
			Model model) {
		
		if(localCode != null && !"".equals(localCode)) {
			LocalCode selectLocalCodeInfo = localCodeService.selectLocalCodeInfo(localCode);
			model.addAttribute("selectLocalCodeInfo", selectLocalCodeInfo);
		}
		model.addAttribute("title", "지역 코드 수정");
		return "sw/code/modifyLocalCode";
	}
	
	//[재천] 지역 코드 수정
	@PostMapping("/modifyLocalCode")
	public String modifyLocalCode(LocalCode localCode) {
		localCodeService.modifyLocalCode(localCode);
		return "redirect:/sw/code/selectLocalCode";
	}
	
	//[재천] 지역 코드 삭제
	@RequestMapping("/deleteLocalCode")
	public @ResponseBody int deleteBusinessCode(LocalCode localCode) {
		return localCodeService.deleteLocalCode(localCode);
	}
	
	//[재천]지역코드 중복체크
	@PostMapping("/localCodeCheck")
	@ResponseBody
	public boolean localCodeCheck(@RequestParam(value = "localCode", required = false)String localCode) {
		boolean localCodeCheckResult = false;
		int localCodeCheck = localCodeService.localCodeCheck(localCode);
		if(localCodeCheck > 0) {
			localCodeCheckResult = true;
		}
		return localCodeCheckResult;
	}
}


