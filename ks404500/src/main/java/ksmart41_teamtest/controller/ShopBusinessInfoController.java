package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.ShopBusinessInfo;
import ksmart41_teamtest.service.ShopBusinessInfoService;

@Controller
@RequestMapping("/shop/business")
public class ShopBusinessInfoController {
	
	@Autowired
	private ShopBusinessInfoService shopBusinessInfoService;
	
	@GetMapping("/addBusinessInfo")
	public String addBusinessInfo() {
		return "shop/business/addBusinessInfo";
	}
	
	@GetMapping("/selectBusinessInfo")
	public String selectBusinessInfo(Model model) {
		List<ShopBusinessInfo> businesslist = shopBusinessInfoService.ShopBusinessList();
		
		model.addAttribute("title", "거래처 조회");
		model.addAttribute("businesslist", businesslist);
		return "shop/business/selectBusinessInfo";
	}
	
}