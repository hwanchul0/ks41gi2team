package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShipmentCode;
import ksmart41_teamtest.mapper.ShopShipmentMapper;

@Service
@Transactional
public class ShopShipmentService {

	
	@Autowired
	private ShopShipmentMapper shopShipmentMapper;
	
	/*유경 - 쇼핑몰 배송단계조회*/
	public List<ShipmentCode> getShipmentCode() {
		List<ShipmentCode> shipmentCode = shopShipmentMapper.getShipmentCode();
		return shipmentCode;
	}
	
	/*유경 - 쇼핑몰 미출고 숫자*/
	public int getCountNoneRealese() {
		int result = 0;
		result = shopShipmentMapper.getCountNoneRealese();
		return result;
	}

	
}
