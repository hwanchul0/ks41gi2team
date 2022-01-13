package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.ShopIsListCode;
import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.service.ShopCodeServiceJYK;
import ksmart41_teamtest.service.SwIsListService;

@Controller
@RequestMapping("/shop/code")
public class ShopCodeControllerJYK {
	
	@Autowired
	private ShopCodeServiceJYK shopCodeServiceJYK;
	
	@GetMapping("/selectIsListCode")
	public String selectShopIsListCode(Model model) {
		List<ShopIsListCode> shopIsListCode = shopCodeServiceJYK.getSelectShopIsListCode();
		model.addAttribute("shopIsListCode", shopIsListCode);
		return "shop/code/selectIsListCode";
	}

}
