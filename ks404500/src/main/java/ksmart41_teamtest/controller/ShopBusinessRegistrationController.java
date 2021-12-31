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
	
	@GetMapping("/addBusinessRegistration")
	public String addBusiness() {
		return "shop/businessRegistration/addBusinessRegistration";
	}

	
	//addBusinessRegistration
	@PostMapping("/addBusinessRegistration")
	public String addBusinessRegistration(Business business) {
	System.out.println("ShopBusinessRegistrationController에서 입력받은 값 " + business);
	
	String brc = business.getBusinessRegistrationCode();
	
	if(brc != null && !"".equals(brc)) {
		business.setClientId("shopid001");
		business.setLocalCode("sw_local_code_02");
		business.setMemberId("swid001");
		businessService.addBusinessRegistration(business);
	}
	
	return "redirect:/sw/business/selectBusiness";
	
	


	}
}
	
