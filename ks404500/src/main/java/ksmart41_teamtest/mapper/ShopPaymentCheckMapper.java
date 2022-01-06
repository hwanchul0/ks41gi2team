package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopPaymentCheck;

@Mapper
public interface ShopPaymentCheckMapper {
	
	//유성 쇼핑몰 결제상태 조회
	public List<ShopPaymentCheck> getShopPaymentCheck();

}
