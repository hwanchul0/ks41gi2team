package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.Expense;

@Mapper
public interface ExpenseMapper {
	
	//유성 쇼핑몰 비용조회
	public List<Expense> getExpense();
	
	//유성 쇼핑몰 비용 마감
	Expense getModifyShopExpense(String shopExpenseCode);

	// 유성 쇼핑몰 비용 마감 
	int ShopExpenseFinish(Expense shopExpenseCode);
	
	// 유성 쇼핑몰 비용 삭제 
	int deleteExpense(Expense expense);
}
