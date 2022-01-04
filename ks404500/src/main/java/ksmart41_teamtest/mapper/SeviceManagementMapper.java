package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ServiceManagement;


@Mapper
public interface SeviceManagementMapper {
	
	// 서비스 등록 
	public int addService(ServiceManagement serviceManagement);
	//  서비스 현황(정보)
	public List<ServiceManagement> getServiceManagement();
	// 서비스 등록 - 서비스 코드 중복체크
	public int serviceCheck(String serviceCode);
}
