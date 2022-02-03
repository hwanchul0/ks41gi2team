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

	// 계약요청 수정
	public int modifyServiceRequest(ServiceRequest serviceRequest);

	// 계약요청 정보
	public ServiceRequest getContractInfo(String contractManageCode);

	// 계약요청 삭제
	public int deleteServiceRequest(ServiceRequest serviceRequest);



	// 서비스 계약요청 확인 -> 승인 페이지
	public int modifyRequestState(String serviceRequestStatus, String contractManageCode);

	// 서비스 계약요청 승인 -> 결제예정 테이블
	public int acceptRequest(String contractManageCode, String slipNumber);

	// 서비스 계약요청 승인이 아닐 때 결제예정 테이블 삭제
	public int deleteRequest(String contractManageCode);

	// 서비스 계약요청 승인 / 승인 날짜 업데이트
	public int nowApprovalDate(String contractManageCode);


	
}
