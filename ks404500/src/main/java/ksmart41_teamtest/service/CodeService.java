package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Code;
import ksmart41_teamtest.mapper.CodeMapper;
import ksmart41_teamtest.mapper.PaymentStateMapper;

@Service
@Transactional
public class CodeService {
	private CodeMapper codeMapper;
	
	public CodeService(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}
	// [환철] 계약상태 코드 등록
	public int addContractStateCode(Code contractStateCode) {
		int addContractStateCode = codeMapper.addContractStateCode(contractStateCode);
		return addContractStateCode;
	};
	//[환철] 계약상태 코드 등록 - 중복체크
	public int contractCodeCheck(String contractStateCode) {
		return codeMapper.contractCodeCheck(contractStateCode);
	};
	// [환철]계약상태 코드 조회
	public List<Code> selectContractStateCode(){
		List<Code> selectContractStateCode = codeMapper.selectContractStateCode();
		return selectContractStateCode;
	}
	// [환철] 계약상태 코드 삭제
	public int deleteContractStateCode(Code contractStateCode) {
		return codeMapper.deleteContractStateCode(contractStateCode);
	}
	// 환불상태 코드 조회
	public List<Code> selectContractRefundStateCode(){
		List<Code> selectContractRefundStateCode = codeMapper.selectContractRefundStateCode();
		return selectContractRefundStateCode;
	}
	//[환철]환불상태 코드 등록 
	public int addContractRefundStateCode(Code refundStateCode) {
		int addContractRefundStateCode = codeMapper.addContractRefundStateCode(refundStateCode);
		return addContractRefundStateCode;
	};
	//[환철] 환불상태 코드 등록 - 중복체크
	public int refundCodeCheck(String refundStateCode) {
		return codeMapper.refundCodeCheck(refundStateCode);
	}
	//[환철] 환불상태 코드 삭제
	public int deleteRefundStateCode(Code refundStateCode) {
		return codeMapper.deleteRefundStateCode(refundStateCode);
	}
	// 결제상태 코드 조회
	public List<Code> selectPaymentStateCode(){
		List<Code> selectPaymentStateCode = codeMapper.selectPaymentStateCode();
		System.out.println("CodeService.java 조회된 환불상태 코드 ======= :" + selectPaymentStateCode);
		return selectPaymentStateCode;
	}
	//[환철]결제상태 코드 등록 
	public int addPaymentStateCode(Code PaymentStateCode) {
		int addPaymentStateCode = codeMapper.addPaymentStateCode(PaymentStateCode);
		return addPaymentStateCode;
	};
	//[환철] 결제상태 코드 등록 - 중복체크
	public int PaymentCodeCheck(String PaymentStateCode) {
		return codeMapper.PaymentCodeCheck(PaymentStateCode);
	}
	//[환철] 결제상태 코드 제거 
	public int deletePaymentStateCode(Code PaymentStateCode) {
		return codeMapper.deletePaymentStateCode(PaymentStateCode);
	}





	
	
}
