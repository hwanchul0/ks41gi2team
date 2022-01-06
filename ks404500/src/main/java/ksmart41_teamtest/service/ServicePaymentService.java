package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public ServicePayment getDetailServicePayment(String paymentCode) {
		ServicePayment getDetailServicePayment = servicePaymentMapper.getDetailServicePayment(paymentCode);
		
		return getDetailServicePayment;
	}

}
