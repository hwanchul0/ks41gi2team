package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.SwExpense;

@Mapper
public interface SwExpenseMapper {
	
	//[재천] 비용 전체 조회
	public List<SwExpense> selectSwExpenseList();
}
