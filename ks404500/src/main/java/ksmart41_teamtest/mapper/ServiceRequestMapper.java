package ksmart41_teamtest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.ServiceRequest;

@Mapper
public interface ServiceRequestMapper {
	
	// 계약요청 전체 리스트 조회(Sw)
	public List<ServiceRequest> getAllRequestList();

	
	// 계약요청 상세정보 조회
	public ServiceRequest getDetailRequestList(String contractManageCode);
	
	
//=======================================================SHOP	
	
	// 계약요청 리스트 조회
	public List<ServiceRequest> getRequestList();

	// 계약요청 등록 - 내 사업장별 대표코드 조회
	public List<Map<String, Object>> findMyMainBizCode(String shopMemberId);
	
	// 계약요청 등록 
	public int addServiceRequest(ServiceRequest serviceRequest);
	

}
