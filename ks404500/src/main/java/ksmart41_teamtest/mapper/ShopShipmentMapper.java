package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShipmentCode;

@Mapper
public interface ShopShipmentMapper {
	
	//유경 - shop 미배송된 주문내역의 합계 구하기
	int getCountNoneRealese();

	//유경 - shop 배송단계 조회
	public List<ShipmentCode> getShipmentCode();

}
