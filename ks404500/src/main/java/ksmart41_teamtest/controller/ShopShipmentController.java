package ksmart41_teamtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	/*유경 - 배송단계 코드 조회*/
	@GetMapping("/selectShipment")
	public String selectShipment(Model model) {
		List<ShipmentCode> shipmentCode = shopShipmentService.getShipmentCode();
		model.addAttribute("title", "배송단계조회");
		model.addAttribute("shipmentCode", shipmentCode);
		System.out.println(shipmentCode + "<---controller");
		return "shop/shipment/selectShipment";
	}
	
}