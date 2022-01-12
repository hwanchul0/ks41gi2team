package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopPaymentCheck;
import ksmart41_teamtest.mapper.ShopPaymentCheckMapper;

@Service
@Transactional
public class ShopPaymentCheckService {
	
	@Autowired
	private ShopPaymentCheckMapper shopPaymentCheckMapper;
	public ShopPaymentCheckService(ShopPaymentCheckMapper shopPaymentCheckMapper) {
		this.shopPaymentCheckMapper = shopPaymentCheckMapper;
	}
	//유성 쇼핑몰 결제상태 조회
	public List<ShopPaymentCheck> getShopPaymentCheck()	{
		List<ShopPaymentCheck>	shopPaymentCheck = shopPaymentCheckMapper.getShopPaymentCheck();
		return shopPaymentCheck;
	}

	//유성 쇼핑몰 결제상태 등록 
	public int addPaymentCheck(ShopPaymentCheck shopPaymentCheck)	{
		int addPaymentCheck = shopPaymentCheckMapper.addPaymentCheck(shopPaymentCheck);
		return addPaymentCheck;
	}
}
