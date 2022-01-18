package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.PaymentState;

@Mapper
public interface PaymentStateMapper {

	//[재천]결제상태 코드 전체 조회
	public List<PaymentState> PaymentStateList();
	
	//[재천]결제상태 코드 등록
	public int addPaymentStateCode(PaymentState paymentState);
	
	//[재천]결제상태 코드 수정
	public int modifyPaymentStateCode(PaymentState paymentState);
	
	//[재천]결제상태 코드 1개 조회
	public PaymentState selectPaymentStateCode(String paymentStateCode);
	
	//[재천]결제상태코드 중복체크
	public int codeCheck (String paymentStateCode);
	
	//[재천]결제상태코드 삭제
	public int deletePaymentCode(PaymentState paymentStateCode);
}
