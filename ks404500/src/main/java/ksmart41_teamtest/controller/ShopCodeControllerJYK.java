package ksmart41_teamtest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart41_teamtest.dto.ShopIsListCode;
import ksmart41_teamtest.service.ShopCodeServiceJYK;

@Controller
@RequestMapping("/shop/code")
public class ShopCodeControllerJYK {
	private static final Logger log = LoggerFactory.getLogger(ShopCodeControllerJYK.class);
	@Autowired
	private ShopCodeServiceJYK shopCodeServiceJYK;
	
	//유경 - 쇼핑몰 손익계정조회
	@GetMapping("/selectIsListCode")
	public String selectShopIsListCode(Model model) {
		List<ShopIsListCode> shopIsListCode = shopCodeServiceJYK.getSelectShopIsListCode();
		model.addAttribute("shopIsListCode", shopIsListCode);		
		return "shop/code/selectIsListCode";
	}
	
	//유경 - 쇼핑몰 손익계정 마감
	@PostMapping("/modifyIsListCode")
	public String modifyIsListCode(ShopIsListCode shopIsListCode) {
		log.info("정보 : {}", shopIsListCode );
		shopCodeServiceJYK.shopModifyIsListCode(shopIsListCode);
		return "redirect:/shop/code/selectIsListCode";
	}
	 
	//유경 - 쇼핑몰 손익계정 수정
	@GetMapping("/modifyIsListCode")
	public String modifyIsListCode(@RequestParam(value="shopIsCode", required = false) String shopIsCode
            ,Model model,  HttpServletResponse response,HttpServletRequest request) throws IOException {
		ShopIsListCode shopIsCodeInfo = shopCodeServiceJYK.getShopIsCodeByShopIsListCode(shopIsCode);
		List<ShopIsListCode> shopIsListCode = shopCodeServiceJYK.getSelectShopIsListCode();
		System.out.println("shopIsListCode====="+shopIsListCode);
		response.setContentType("text/html; charset=UTF-8");
		if(shopIsCode != null && !"".equals(shopIsCode) && "Y".equals(shopIsCodeInfo.getShopIsAmend()) ) {
			model.addAttribute("shopIsCodeInfo", shopIsCodeInfo);
			model.addAttribute("shopIsListCode", shopIsListCode);
			shopIsCodeInfo.getShopIsAmend();

		}else if("N".equals(shopIsCodeInfo.getShopIsAmend())){
            PrintWriter out = response.getWriter();
            out.println("<script>alert('수정할 수 없는 계정과목입니다.'); history.go(-1);</script>");
            out.flush();
            out.close();
		}
		return "shop/code/modifyIsListCode";
	}
}
