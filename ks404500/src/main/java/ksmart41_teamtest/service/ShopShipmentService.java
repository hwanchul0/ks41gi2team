package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShipmentCode;
import ksmart41_teamtest.mapper.CodeMapper;

@Service
@Transactional
public class ShopShipmentService {
	
	@Autowired
	private CodeMapper codeMapper;
	
	public ShopShipmentService(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}
	
	/*유경 - 배송단계조회*/
	public List<ShipmentCode> getShipmentCode() {
		List<ShipmentCode> shipmentCode = codeMapper.getShipmentCode();
		return shipmentCode;
	}

	
}
