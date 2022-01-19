package ksmart41_teamtest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopAddAccounting;
import ksmart41_teamtest.dto.ShopTotalAccounting;
import ksmart41_teamtest.mapper.ShopAddAccountingMapper;

@Service
@Transactional
public class ShopAcountingService {
	
	private static final Logger log = LoggerFactory.getLogger(ShopAcountingService.class);
	
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
		//int result = shopAddAccountingMapper.addIncome(shopAddAccounting,shopMemberId);
		return shopAddAccountingMapper.addIncome(shopAddAccounting);
	}
	
	//유경 - 쇼핑몰 매출 조회
	public List<ShopAddAccounting> getSelectIncome() {
		List<ShopAddAccounting> shopAddAccounting = shopAddAccountingMapper.getSelectIncome();
		return shopAddAccounting;
	}
	
	//유경 - 쇼핑몰 통합회계 조회
	public int getSelectTotalAccounting() {
		int expense = 0;
		expense = shopAddAccountingMapper.getSelectTotalAccounting();
		return expense;
	}
	
	//유경 - 쇼핑몰 매출 마감
	public ShopAddAccounting getModifyShopIncome(String shopIncomeCode) {
		return shopAddAccountingMapper.getModifyShopIncome(shopIncomeCode);
	}
	
	//유경 - 쇼핑몰 매출 마감 - post
	public int ShopIncomeFinish(ShopAddAccounting shopIncomeCode) {
		return shopAddAccountingMapper.ShopIncomeFinish(shopIncomeCode);
	}
	
	//유경 - 쇼핑몰 차트
	public ShopAddAccounting getIncomeChart() {
		ShopAddAccounting incomeChart = shopAddAccountingMapper.getIncomeChart();
		log.info("controller incomeChart =========", incomeChart);
		return incomeChart;
	}
	
	//유경 - 쇼핑몰 매출 삭제
	public int deleteIncome(ShopAddAccounting shopAddAccounting) {
		return shopAddAccountingMapper.deleteIncome(shopAddAccounting); 
	}
	
	//유경 - 쇼핑몰 통합회계매출 조회
	public List<ShopAddAccounting> selectByTotalIncome() {
		List<ShopAddAccounting> totalIncome = shopAddAccountingMapper.selectByTotalIncome();
		return totalIncome;
	}
	
	//유경 - 쇼핑몰 통합회계매출 등록
	public int addTotalAccountingByIncome(ShopAddAccounting shopAddAccounting) {
		int result = shopAddAccountingMapper.addTotalAccountingByIncome(shopAddAccounting);
		return result;
	}
	
	//유경 - 쇼핑몰 통합회계매입 조회
	public List<ShopAddAccounting> selectByTotalExpense() {
		List<ShopAddAccounting> totalExpense = shopAddAccountingMapper.selectByTotalExpense();
		return totalExpense;
	}
	
	//유경 - 쇼핑몰 통합회계비용 등록
	public int addTotalAccountingByExpense(ShopAddAccounting shopAddAccounting) {
		int result = shopAddAccountingMapper.addTotalAccountingByExpense(shopAddAccounting);
		return result;
	}
	
	//유경 - 쇼핑몰 통합회계조회
	public List<ShopAddAccounting> selectTotalAccounting() {
		List<ShopAddAccounting> shopAccounting = shopAddAccountingMapper.selectTotalAccounting();
		return shopAccounting;
	}

	//유경 - 쇼핑몰 분기 매출 조회
	public List<ShopTotalAccounting> selectShopIncome() {
		List<ShopTotalAccounting> shop2021Income = shopAddAccountingMapper.selectShopIncome();
		return shop2021Income;
	}
	//유경 - 쇼핑몰 분기 비용 조회
	public List<ShopTotalAccounting> selectShopExpense() {
		List<ShopTotalAccounting> shop2021Expense = shopAddAccountingMapper.selectShopExpense();
		return shop2021Expense;
	}

}
