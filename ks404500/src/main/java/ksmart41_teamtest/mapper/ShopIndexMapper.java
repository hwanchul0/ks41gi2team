package ksmart41_teamtest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopIndexMapper {
	
	//유경 - 미배송건수
	HashMap<String, Object> indexShopGetSipment();
	
	//유경 - 결제대기
	HashMap<String, Object> indexShopGetWatingPayment();
	
	//유경 - 일주일간 주문
	HashMap<String, Object> indexShopGetWeekOrder();

	//유경 - 주문 실적
	List<HashMap<String, Object>> indexShopGetPercent();
	
	//유경 - 최근 일주일 조회
	HashMap<String, Object> indexShopGetPeriod();


}
