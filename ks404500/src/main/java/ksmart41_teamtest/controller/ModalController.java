package ksmart41_teamtest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sw/modal")
public class ModalController {
	
	@GetMapping("/arequestModal")
	public String requestModal(Model model) {
		model.addAttribute("title", "모달화면");
		//List<String> requestModal = new ArrayList<String>();
		//model.addAttribute("requestModal", requestModal);
		return "sw/modal/requestModal";
	}
	
	/* json 방식
	 * @GetMapping(value="/json", produces = "application/json")
	 * 
	 * @ResponseBody public List<String> json(Model model) {
	 * model.addAttribute("title", "모달화면"); List<String> userList = new
	 * ArrayList<String>(); userList.add("홍길동"); userList.add("이순신"); return
	 * userList; }
	 */
	
	// 모달 가져올 컨트롤러
	@GetMapping("/getModal")
	public String getModal(Model model) {
		//model.addAttribute("title", "메인화면");
		return "getModal";
	}
	
}
