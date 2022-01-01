package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ServiceManagement;
import ksmart41_teamtest.mapper.SeviceManagementMapper;

@Service
@Transactional
public class ServiceManagementService {
	
	private SeviceManagementMapper seviceManagementMapper;
	
	public ServiceManagementService(SeviceManagementMapper seviceManagementMapper) {
		this.seviceManagementMapper = seviceManagementMapper;
		}
	// 서비스 현황(정보)
	public List<ServiceManagement> getServiceManagement(){
		List<ServiceManagement> getServiceManagement = seviceManagementMapper.getServiceManagement();
		System.out.println("getServiceManagement : " + getServiceManagement);
		return getServiceManagement;
	}
}
