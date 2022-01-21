package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart41_teamtest.dto.ServicePayment;
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
	
	//[재천]매출 전체 조회
	public List<SwIncome> selectSwIncomeList(){
		List<SwIncome> incomelist = swIncomeMapper.selectSwIncomeList();
		System.out.println("서비스 값" + incomelist);
		return incomelist;
	}
	
	//[재천]매출 등록 1번
	public int addSwIncome(ServicePayment servicePayment) {
		return swIncomeMapper.addSwIncome(servicePayment);
	}
	
	//[재천]매출 삭제
	public int deleteIncome(SwIncome swIncome) {
		return swIncomeMapper.deleteIncome(swIncome);
	}
}
