package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopRequestShipment;

@Mapper
public interface ShopRequestShipmentMapper {
	// 유성 배송 요청 조회 
	
	public List<ShopRequestShipment> getShopRequestShipment();
}
