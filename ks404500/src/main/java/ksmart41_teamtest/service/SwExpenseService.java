package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.SwExpense;
import ksmart41_teamtest.mapper.SwExpenseMapper;

@Service
@Transactional
public class SwExpenseService {

	@Autowired
	private SwExpenseMapper swExpenseMapper;
	public SwExpenseService(SwExpenseMapper swExpenseMapper) {
		this.swExpenseMapper = swExpenseMapper;
	}
	
	//[재천]비용 전체 조회
	public List<SwExpense> selectSwExpenseList(){
		List<SwExpense> expenselist = swExpenseMapper.selectSwExpenseList();
		return expenselist;
	}
	
	//[재천]비용 등록
	public int addExpense(SwExpense swExpense) {
		int addExpense = swExpenseMapper.addExpense(swExpense);
		return addExpense;
	}
	
	//[재천]지출코드 1개 조회
	public SwExpense selectSwExpense(String swExpensePayCode) {
		return swExpenseMapper.selectSwExpense(swExpensePayCode);
	}
	
	//[재천]비용마감 처리
	public int finishExpense(SwExpense swExpense) {
		return swExpenseMapper.finishExpense(swExpense);
	}
	
	//[재천]비용 수정
	public int modifyExpense(SwExpense swExpense) {
		return swExpenseMapper.modifyExpense(swExpense);
	}
	
	//[재천]비용 삭제
	public int deleteExpense(SwExpense swExpense) {
		return swExpenseMapper.deleteExpense(swExpense);
	}
	
}
