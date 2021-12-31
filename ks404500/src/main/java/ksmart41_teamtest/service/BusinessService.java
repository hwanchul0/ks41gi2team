package ksmart41_teamtest.service;

import java.util.List;
import java.util.Map;

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
	
	public List<Business> getBusiness() {
		List<Business> business = businessMapper.getBusiness();
		//System.out.println(business + "<-- service");
		return business;
	}



}
