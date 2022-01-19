package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.SwExpense;

@Mapper
public interface SwExpenseMapper {
	
	//[재천]비용 전체 조회
	public List<SwExpense> selectSwExpenseList();
	
	//[재천]비용 등록
	public int addExpense(SwExpense swExpense);
	
	//[재천]지출코드 1개 조회
	public SwExpense selectSwExpense(String swExpensePayCode);
	
	//[재천]마감처리
	public int finishExpense(SwExpense swExpense);
	
	//[재천]비용 수정처리
	public int modifyExpense(SwExpense swExpense);
	
	//[재천]비용 삭제
	public int deleteExpense(SwExpense swExpense);
}
