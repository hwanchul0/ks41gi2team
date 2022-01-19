package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import ksmart41_teamtest.dto.ShopRequestShipment;
import ksmart41_teamtest.mapper.ShopRequestShipmentMapper;

@Service
@Transactional
public class ShopRequestShipmentService {
	@Autowired
	private ShopRequestShipmentMapper shopRequestShipmentMapper;
	public ShopRequestShipmentService (ShopRequestShipmentMapper shopRequestShipmentMapper) {
		this.shopRequestShipmentMapper = shopRequestShipmentMapper;
	}
	
	//유성 배송 요청 조회
	
	public List<ShopRequestShipment> getShopRequestShipment() {
		List<ShopRequestShipment> shopRequestShipment = shopRequestShipmentMapper.getShopRequestShipment();
		return shopRequestShipment;
	}
}
