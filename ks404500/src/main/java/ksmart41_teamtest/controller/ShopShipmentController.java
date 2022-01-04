package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart41_teamtest.dto.ShipmentCode;
import ksmart41_teamtest.service.ShopShipmentService;

@Controller
@RequestMapping("/shop/shipment")
public class ShopShipmentController {
	
	@Autowired
	private ShopShipmentService shopShipmentService; 
	
	@GetMapping("/addRequestShipment")
	public String addRequestShipment() {
		return "shop/shipment/addRequestShipment";
	}
	
	@GetMapping("/addShipment")
	public String addShipment() {
		return "shop/shipment/addShipment";
	}
	
	@GetMapping("/selectRequestShipment")
	public String selectRequestShipment() {
		return "shop/shipment/selectRequestShipment";
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
	
}