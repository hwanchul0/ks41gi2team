package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopAddPaymentCheck;
import ksmart41_teamtest.dto.ShopPaymentCheck;

@Mapper
public interface ShopPaymentCheckMapper {
	
	//유성 쇼핑몰 결제 조회
	public List<ShopPaymentCheck> getShopPaymentCheck();

	//유성 쇼핑몰 결제 등록
	public int addPaymentCheck(ShopPaymentCheck shopPaymentCheck);
	
	//유성 쇼핑몰 결제 등록대상 조회
	List<ShopAddPaymentCheck> getAddShopAddPaymentCheck();
	
	//유성 쇼핑몰 결제 삭제
	int deletePaymentCheck(ShopPaymentCheck shopPaymentCheck);

	//유성 쇼핑몰 결제 수정 (complete 바꾸기)
	public int ShopModifyPaymentCheck(ShopPaymentCheck shopPaymentCheckCode);
	
	public ShopPaymentCheck getModifyPaymentCheck(String shopPaymentCheckCode);
	
}
