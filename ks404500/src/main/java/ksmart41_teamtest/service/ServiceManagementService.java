package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.mapper.SeviceManagementMapper;

@Service
@Transactional
public class ServiceManagementService {
	
	private SeviceManagementMapper serviceManagementMapper;
	
	public ServiceManagementService(SeviceManagementMapper seviceManagementMapper) {
		this.serviceManagementMapper = seviceManagementMapper;
		}
	// 서비스 현황(정보)
	public List<ServiceManagement> getServiceManagement(){
		List<ServiceManagement> getServiceManagement = serviceManagementMapper.getServiceManagement();
		System.out.println("getServiceManagement : " + getServiceManagement);
		return getServiceManagement;
	}
	// 서비스 등록
	public int addService(ServiceManagement serviceManagement) {
		int addService = serviceManagementMapper.addService(serviceManagement);
		return addService;
	}
	// 서비스 등록 - 서비스 코드 중복체크
	public int serviceCheck(String serviceCode) {
		return serviceManagementMapper.serviceCheck(serviceCode);
	}
	//  서비스 수정
	public int modifyService(ServiceManagement serviceManagement) {
		return serviceManagementMapper.modifyService(serviceManagement);
	}
	// 서비스 정보 조회
	public ServiceManagement getServiceInfo(String serviceCode) {
		return serviceManagementMapper.getServiceInfo(serviceCode);
	}
	// 서비스 삭제
	public int deleteService(ServiceManagement serviceManagement) {
		return serviceManagementMapper.deleteService(serviceManagement);
	}
		

}
