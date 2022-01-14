package ksmart41_teamtest.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ServiceRequest;
import ksmart41_teamtest.mapper.ServiceRequestMapper;

@Service
@Transactional
public class ServiceRequestService {

	private ServiceRequestMapper serviceRequestMapper;

	public ServiceRequestService(ServiceRequestMapper serviceRequestMapper) {
		this.serviceRequestMapper = serviceRequestMapper;
		}

//========================================================SW
	
	// 계약요청 전체 조회(장바구니)
	public List<ServiceRequest> getAllRequestList(){
		List<ServiceRequest> getAllRequestList = serviceRequestMapper.getAllRequestList();
		System.out.println("ServiceRequestService : " + getAllRequestList);
		return getAllRequestList;
	}

	
	// 계약요청 상세페이지 ( sw )
	public ServiceRequest getDetailRequestList(String contractManageCode){
		ServiceRequest getDetailRequestList = serviceRequestMapper.getDetailRequestList(contractManageCode);
		return getDetailRequestList;
	}
	
// =============================================================== SHOP	
	// 계약요청 조회 ( shop - client )
	public List<ServiceRequest> getRequestList() {
		List<ServiceRequest> getRequestList = serviceRequestMapper.getRequestList();
		
		return getRequestList;
	}
	// 계약요청 등록 - 내 사업장별 대표코드 조회 ( 모달 )
	public List<Map<String, Object>> findMyMainBizCode(String shopMemberId) {
		
		return serviceRequestMapper.findMyMainBizCode(shopMemberId);
	}
	// 계약요청 등록
	public int addServiceRequest(ServiceRequest serviceRequest) {
		int addServiceRequest = serviceRequestMapper.addServiceRequest(serviceRequest);
		return addServiceRequest;
	}
	
}

