package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ServicePayment;

@Mapper
public interface ServicePaymentMapper {
	
	// 서비스 계약요청 결제예정 조회 (sw)
	public List<ServicePayment> getServicePaymentSum();
	
	// 서비스 계약요청 결제예정 상세정보(sw)
	public ServicePayment getDetailServicePayment(String paymentCode);
}
