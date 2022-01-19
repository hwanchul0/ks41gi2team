package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.dto.SwIncome;

@Mapper
public interface SwIncomeMapper {

	//[재천]매출 조회
	public List<SwIncome> selectSwIncomeList();
	
	//[재천]매출 등록 (k2_sw_income)
	public int addSwIncome (ServicePayment servicePayment);
	/*
	 * //[재천]매출등록 (k2_sw_paymentCheck) public int addSwIncome2 (SwIncome swIncome);
	 */
}
