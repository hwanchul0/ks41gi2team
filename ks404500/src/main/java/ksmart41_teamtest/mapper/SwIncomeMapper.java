package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.SwIncome;

@Mapper
public interface SwIncomeMapper {

	//[재천]매출 조회
	public List<SwIncome> selectSwIncomeList();
	
}
