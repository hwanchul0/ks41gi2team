package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopAddAccounting;
import ksmart41_teamtest.mapper.ShopAddAccountingMapper;

@Service
@Transactional
public class ShopAcountingService {
	
	@Autowired
	private ShopAddAccountingMapper shopAddAccountingMapper;
	
	//유경 - 쇼핑몰 매출 등록화면
	public List<ShopAddAccounting> getAddIncome() {
		List<ShopAddAccounting> shopAddAccounting = shopAddAccountingMapper.getAddIncome();
		return shopAddAccounting;
	}
	
	//유경 - 쇼핑몰 매출코드 증가
	public ShopAddAccounting getAddIncomeCode() {
		ShopAddAccounting shopAddIncomeCode = shopAddAccountingMapper.getAddIncomeCode();
		return shopAddIncomeCode;
	}
	
	//유경 - 쇼핑몰 매출 등록
	public int addIncome(ShopAddAccounting shopAddAccounting) {
		int result = shopAddAccountingMapper.addIncome(shopAddAccounting);
		return result;
	}

}
