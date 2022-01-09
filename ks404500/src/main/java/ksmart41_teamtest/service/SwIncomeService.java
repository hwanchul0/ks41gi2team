package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.SwIncome;
import ksmart41_teamtest.mapper.SwIncomeMapper;

@Service
@Transactional
public class SwIncomeService {

	@Autowired
	private SwIncomeMapper swIncomeMapper;
	public SwIncomeService(SwIncomeMapper swIncomeMapper) {
		this.swIncomeMapper = swIncomeMapper;
	}
	
	//[재천]비용 전체 조회
	public List<SwIncome> selectSwIncomeList(){
		List<SwIncome> incomelist = swIncomeMapper.selectSwIncomeList();
		System.out.println("서비스 값" + incomelist);
		return incomelist;
	}
} 