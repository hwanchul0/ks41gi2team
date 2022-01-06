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
	
	public List<Expense> getExpense() {
		List<Expense> expense = expenseMapper.getExpense();
		return expense;
	}
}
