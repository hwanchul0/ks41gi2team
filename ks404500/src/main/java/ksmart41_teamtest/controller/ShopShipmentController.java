package ksmart41_teamtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop/shipment")
public class ShopShipmentController {
	
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
	
	@GetMapping("/selectShipment")
	public String selectShipment() {
		return "shop/shipment/selectShipment";
	}
	
}