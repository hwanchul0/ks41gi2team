package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Code;
import ksmart41_teamtest.mapper.CodeMapper;

@Service
@Transactional
public class CodeService {
	private CodeMapper codeMapper;
	
	public CodeService(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}
	// 계약상태 코드 조회
	public List<Code> selectContractStateCode(){
		List<Code> selectContractStateCode = codeMapper.selectContractStateCode();
		System.out.println("CodeService.java 조회된 계약상태 코드  =======:" + selectContractStateCode);
		return selectContractStateCode;
	}
	// 환불상태 코드 조회
	public List<Code> selectContractRefundStateCode(){
		List<Code> selectContractRefundStateCode = codeMapper.selectContractRefundStateCode();
		System.out.println("CodeService.java 조회된 환불상태 코드 ======= :" + selectContractRefundStateCode);
		return selectContractRefundStateCode;
	}
	// 결제상태 코드 조회
	public List<Code> selectPaymentStateCode() {
		List<Code> selectPaymentStateCode = codeMapper.selectPaymentStateCode();
		System.out.println("CodeService.java 조회된 결제상태 코드 =====: " + selectPaymentStateCode);
		return selectPaymentStateCode;
	}
	
	
}
