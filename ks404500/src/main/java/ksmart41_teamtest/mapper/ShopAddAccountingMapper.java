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
	public int addIncome(ShopAddAccounting shopAddAccounting);
	
	//유경 - 쇼핑몰 매출조회
	List<ShopAddAccounting> getSelectIncome();
	
	//유경 - 쇼핑몰 매출 마감
	ShopAddAccounting getModifyShopIncome(String shopIncomeCode);
	
	//유경 - 쇼핑몰 매출 마감
	int ShopIncomeFinish(ShopAddAccounting shopIncomeCode);
	
	//유경 - 쇼핑몰 통합회계 조회
	int getSelectTotalAccounting();
	
	//유경 - 쇼핑몰 매출 차트 조회
	ShopAddAccounting getIncomeChart();
	
	//유경 - 쇼핑몰 매출삭제
	int deleteIncome(ShopAddAccounting shopAddAccounting);
	
	//유경 - 쇼핑몰통합매출회계조회 
	List<ShopAddAccounting> selectByTotalIncome();
	
	//유경 - 쇼핑몰통합매출회계등록
	int addTotalAccountingByIncome(ShopAddAccounting shopAddAccounting);
	
	//유경 - 쇼핑몰통합비용회계조회
	List<ShopAddAccounting> selectByTotalExpense();
	
	//유경 - 쇼핑몰통합비용회계등록
	int addTotalAccountingByExpense(ShopAddAccounting shopAddAccounting);

}
