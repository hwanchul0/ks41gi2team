package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.PaymentState;
import ksmart41_teamtest.dto.ServicePayment;

@Mapper
public interface ServicePaymentMapper {
	
	// 서비스 계약요청 결제예정 조회 (sw)
	public List<ServicePayment> getServicePaymentSum();
	
	// 서비스 계약요청 결제예정 상세정보(sw)
	public ServicePayment servicePaymentCheck(String paymentCode);
	
	// 서비스 결제 확인 - 결제상태 조회
	public List<PaymentState> getPaymentStateCode();
	
	// 서비스 결제 확인 저장시 결제 예정 테이블 결제상태 업데이트
	public int modifyPaymentStateCode(String paymentStateCode, String servicePaymentCheck);
	
	// 서비스 결제 후 계약현황 관리
	public List<ServicePayment> selectContractState();
	
	// 서비스 결제 후 계약현황 수정
	public ServicePayment getContractState(String getContractState);

}
