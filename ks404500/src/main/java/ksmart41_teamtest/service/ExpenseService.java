package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Expense;
import ksmart41_teamtest.mapper.ExpenseMapper;

@Service
@Transactional
public class ExpenseService {

	@Autowired
	private ExpenseMapper expenseMapper;
	public ExpenseService(ExpenseMapper expenseMapper) {
		this.expenseMapper = expenseMapper;
	}
	//유성 - 사업장 등록
	public int addExpense(Expense expense) {
		int addExpense = expenseMapper.addExpense(expense);
		return addExpense;
	}
	//유성 - 쇼핑몰 비용 조회
	public List<Expense> getExpense() {
		List<Expense> expense = expenseMapper.getExpense();
		return expense;
	}
	// 유성 쇼핑몰 비용 마감 
	public Expense getModifyShopExpense(String shopExpenseCode)	{
		return expenseMapper.getModifyShopExpense(shopExpenseCode);
	}
	
	// 유성 쇼핑몰 비용 마감 - post
	public int ShopExpenseFinish(Expense shopExpenseCode) {
		return expenseMapper.ShopExpenseFinish(shopExpenseCode);
	}
	
	// 유성 쇼핑몰 비용 삭제 
	public int deleteExpense(Expense expense)	{
		return expenseMapper.deleteExpense(expense);
	}

}
