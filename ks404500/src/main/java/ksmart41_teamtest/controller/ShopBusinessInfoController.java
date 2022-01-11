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

import ksmart41_teamtest.dto.ShopBusinessInfo;
import ksmart41_teamtest.service.ShopBusinessInfoService;

@Controller
@RequestMapping("/shop/business")
public class ShopBusinessInfoController {
	
	@Autowired
	private ShopBusinessInfoService shopBusinessInfoService;
	
	@GetMapping("/addBusinessInfo")
	public String addBusinessInfo(Model model) {
		model.addAttribute("title", "거래처 등록");
		return "shop/business/addBusinessInfo";
	}
	
	@GetMapping("/selectBusinessInfo")
	public String selectBusinessInfo(Model model) {
		List<ShopBusinessInfo> businesslist = shopBusinessInfoService.ShopBusinessList();
		model.addAttribute("title", "거래처 조회");
		model.addAttribute("businesslist", businesslist);
		return "shop/business/selectBusinessInfo";
	}
	
	@PostMapping("/addBusinessInfo")
	public String addBusinessInfo(ShopBusinessInfo shopBusinessInfo) {
		System.out.println("컨트롤러 에서 받은 값 >>>" + shopBusinessInfo);

		shopBusinessInfoService.addBusinessInfo(shopBusinessInfo);
		return "redirect:/shop/business/selectBusinessInfo";
	}
	@GetMapping("/modifyBusinessInfo")
	public String modifyBusinessInfo(@RequestParam(value = "shopClientCode", required = false)String shopClientCode,
			Model model) {
		System.out.println(shopClientCode + "컨트롤러확인");
		if(shopClientCode != null && !"".equals(shopClientCode)) {
			ShopBusinessInfo shopbusinesscode = shopBusinessInfoService.selectBusinessInfo(shopClientCode);
			model.addAttribute("shopbusinesscode", shopbusinesscode);
		}
		model.addAttribute("title", "거래처 수정");
		return "shop/business/modifyBusinessInfo";
	}
	
	@PostMapping("/modifyBusinessInfo")
	public String modifyBusinessInfo(ShopBusinessInfo shopClientCode) {
		shopBusinessInfoService.modifyBusinessInfo(shopClientCode);
		return "redirect:/shop/business/selectBusinessInfo";
	}
	
	@RequestMapping("/deleteBusinessInfo")
	public @ResponseBody int deleteBusinessInfo(ShopBusinessInfo shopBusinessInfo) {
		return shopBusinessInfoService.deleteBusinessInfo(shopBusinessInfo);
	}
	
}