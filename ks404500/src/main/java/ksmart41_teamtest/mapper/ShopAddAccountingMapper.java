package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopAddAccounting;

@Mapper
public interface ShopAddAccountingMapper {
	
	//유경 - 쇼핑몰 매출 등록대상 조회
	List<ShopAddAccounting> getAddIncome();
	
	//유경 - 쇼핑몰 매출코드 증가
	ShopAddAccounting getAddIncomeCode();
	
	//유경 - 쇼핑몰 매출등록
	int addIncome(ShopAddAccounting shopAddAccounting);

}
