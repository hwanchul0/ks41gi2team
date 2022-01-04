package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Business;
import ksmart41_teamtest.mapper.BusinessMapper;

@Service
@Transactional
public class BusinessService {
	
	@Autowired
	private BusinessMapper businessMapper;
	public BusinessService(BusinessMapper businessMapper) {
		this.businessMapper = businessMapper;
	}
	//[유성] 사업장 등록
	public int addBusinessRegistration(Business business) {
		int addBusinessRegistration = businessMapper.addBusinessRegistration(business);
		return addBusinessRegistration; 
	}
	//[유성] 사업장 전체 조회
	public List<Business> getBusiness() {
		List<Business> business = businessMapper.getBusiness();
		//System.out.println(business + "<-- service");
		return business;
	}
	// [유성] 사업장 조회
	
	public Business getBusiness(String clinetId) {
		return businessMapper.getBusiness(clinetId);
	}
	//[유성] 사업장 수정
	public int modifyBusiness(Business business) {
		return businessMapper.modifyBusiness(business);
	}
	
	
	


}
