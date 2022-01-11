package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.PaymentState;
import ksmart41_teamtest.mapper.PaymentStateMapper;

@Service
@Transactional
public class PaymentStateService {

	//[재천]DI
	@Autowired
	private PaymentStateMapper paymentStateMapper;
	public PaymentStateService (PaymentStateMapper paymentStateMapper) {
		this.paymentStateMapper = paymentStateMapper;
	}
	
	//[재천]결제 상태 코드 전체 조회
	public List<PaymentState>PaymentStateList(){
		List<PaymentState> paymentlist = paymentStateMapper.PaymentStateList();
		return paymentlist;
	}
	
	//[재천]결제 상태 코드 등록
	public int addPaymentStateCode(PaymentState paymentState) {
		int addPaymentStateCode = paymentStateMapper.addPaymentStateCode(paymentState);
		return addPaymentStateCode;
	}
	
	//[재천]결제 상태 코드 수정
	public int modifyPaymentStatecode(PaymentState paymentState) {
		int modifyPaymentStateCode = paymentStateMapper.modifyPaymentStateCode(paymentState);
		return modifyPaymentStateCode;
	}
	
	//[재천]결제 상태 코드 1개 조회
	public PaymentState selectPaymentStateCode(String paymentStateCode) {
		return paymentStateMapper.selectPaymentStateCode(paymentStateCode);
	}
	
}
