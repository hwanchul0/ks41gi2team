package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.Expense;

@Mapper
public interface ExpenseMapper {
	
	//유성 비용조회
	public List<Expense> getExpense();

}
