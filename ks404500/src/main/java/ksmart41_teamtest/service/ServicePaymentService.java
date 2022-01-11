package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.PaymentState;
import ksmart41_teamtest.dto.ServicePayment;
import ksmart41_teamtest.mapper.ServicePaymentMapper;

@Service
@Transactional
public class ServicePaymentService {
	
	private ServicePaymentMapper servicePaymentMapper;
	
	public ServicePaymentService(ServicePaymentMapper servicePaymentMapper) {
		this.servicePaymentMapper = servicePaymentMapper;
	}
	// 서비스 계약요청 결제 예정 조회(sw)
	public List<ServicePayment> getServicePaymentSum(){
		List<ServicePayment> getServicePaymentSum = servicePaymentMapper.getServicePaymentSum();
		System.out.println("ServicePaymentService : " + getServicePaymentSum );
		return getServicePaymentSum;
	}
	// 서비스 계약요청 결제예정 상세 (sw)
	public ServicePayment servicePaymentCheck(String paymentCode) {
		ServicePayment servicePaymentCheck = servicePaymentMapper.servicePaymentCheck(paymentCode);
		
		return servicePaymentCheck;
	}
	// 결제 상태 코드 정보
	public List<PaymentState> getPaymentStateCode(){
		List<PaymentState> getPaymentStateCode = servicePaymentMapper.getPaymentStateCode();
		
		return getPaymentStateCode;
	}
	// 서비스 결제 확인 저장시 결제 예정 테이블 결제상태 업데이트
	public int modifyPaymentStateCode(String paymentStateCode, String servicePaymentCheck) {
		return servicePaymentMapper.modifyPaymentStateCode(paymentStateCode, servicePaymentCheck);
	}
		
}
