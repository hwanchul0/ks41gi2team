package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Business;

@Mapper
public interface BusinessMapper {
	//사업장 등록
	public int addBusinessRegistration(Business business);
	
	//사업장 조회
	public List<Business> getBusiness();
}
