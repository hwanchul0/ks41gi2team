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
import ksmart41_teamtest.dto.ShipmentCode;
import ksmart41_teamtest.dto.ShopRequestShipment;
import ksmart41_teamtest.service.ShopRequestShipmentService;
import ksmart41_teamtest.service.ShopShipmentService;

@Controller
@RequestMapping("/shop/shipment")
public class ShopShipmentController {
	
	@Autowired
	private ShopShipmentService shopShipmentService; 
	@Autowired
	private ShopRequestShipmentService shopRequestShipmentService;
	
	/* 유성 배송 요청 ((수정modify)배송단계 / 배송 시작일자 input) */
	@GetMapping("/modifyShipment")
	public String modifyShipment(@RequestParam(value = "shopOrderCode", required = false) String shopOrderCode,
								Model model) {
		ShipmentCode getShipmetRequest = shopShipmentService.getShipmetRequest(shopOrderCode);
		model.addAttribute("getShipmetRequest", getShipmetRequest);
		System.out.println(shopOrderCode + "받아온 shopOrderCode (controller)");
		if(shopOrderCode != null && !"".equals(shopOrderCode)) {
			ShipmentCode getShipmentCode = shopShipmentService.getShipmetRequest(shopOrderCode);
			model.addAttribute("getShipmentCode", getShipmentCode);
		}
		model.addAttribute("tilte", "배송요청등록");
		return "shop/shipment/modifyShipment";
	}
	
	/* 유성 배송 요청 ( modify post) */
	@PostMapping("/modifyShipment")
	public String modifyShipment(ShipmentCode shipmentCode) {
		shopShipmentService.modifyShipment(shipmentCode);
		return "redirect:/shop/shipment/selectShipment";
	}


	//유경 - shop 미배송된 주문내역의 합계 구하기
	@PostMapping("/shipmentCheck")
	@ResponseBody
	public int shipmentCheck (Model model) {
		int result = shopShipmentService.getCountNoneRealese();
		System.out.println("미배송건수 : "+ result);
		return result;
	 }
	 
	 
	/*유경 - 쇼핑몰 배송단계 조회*/
	@GetMapping("/selectShipment")
	public String selectShipment(Model model) {
		List<ShipmentCode> shipmentCode = shopShipmentService.getShipmentCode();
		model.addAttribute("title", "배송단계조회");
		model.addAttribute("shipmentCode", shipmentCode);
		//System.out.println(shipmentCode + "<---controller");
		return "shop/shipment/selectShipment";
	}
	
	// 유성 - 배송요청 조회 (출고가 안된) 
	@GetMapping("/selectRequestShipment")
	public String selectRequestShipment(Model model) {
		List<ShopRequestShipment> shopRequestShipment = shopRequestShipmentService.getShopRequestShipment();
		model.addAttribute("title", "배송요청조회");
		model.addAttribute("shopRequestShipment", shopRequestShipment);
		System.out.println(shopRequestShipment + "<--controller");
		return "shop/shipment/selectRequestShipment";
	}
	
}