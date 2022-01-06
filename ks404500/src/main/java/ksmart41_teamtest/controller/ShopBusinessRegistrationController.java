package ksmart41_teamtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.Business;
import ksmart41_teamtest.service.BusinessService;

@Controller
@RequestMapping("/shop/businessRegistration")

public class ShopBusinessRegistrationController {
	
	//의존성 주입
	@Autowired
	private BusinessService businessService;
	@Autowired
	
	//유성 사업장 등록
	@GetMapping("/addBusinessRegistration")
	public String addBusiness() {
		return "shop/businessRegistration/addBusinessRegistration";
	}

	
	//유성 사업장 등록
	@PostMapping("/addBusinessRegistration")
	public String addBusinessRegistration(Business business) {
	System.out.println("ShopBusinessRegistrationController에서 입력받은 값 " + business);
	
		businessService.addBusinessRegistration(business);
		return "redirect:/sw/business/selectBusiness";
	}
	
	
	


}

	
