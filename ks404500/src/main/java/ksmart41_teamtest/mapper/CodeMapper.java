package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Code;
import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwIsListCode;

@Mapper
public interface CodeMapper {
	
	//유경 - sw 세금계산서 수정사유 조회
	public List<InvoiceReason> getInvoiceReason();
	
	//유경 - sw 손익계정조회
	public List<SwIsListCode> getSwIsListCode();
	
	//유경 - 손익계정등록-안쓸듯
	public int addIsListCode(SwIsListCode swiscode);
	
	//유경 - 등록된 손익계정 값 가져오기
	public SwIsListCode getSwIsCodeBySwIsListCode(String swIsCode);
	
	//유경 - 등록된 손익계정 수정하기
	public int modifyIsListCode(SwIsListCode swiscode);
	
	
	//환철 - 서비스 계약상태 코드 등록
	
	//환철 - 서비스 계약상태 코드 조회
	public List<Code> selectContractStateCode();
	//환철 - 서비스 환불상태 코드 등록
	
	//환철- 서비스 환불상태 코드 조회
	public List<Code> selectContractRefundStateCode();
	//환철 - 서비스 결제상태 코드 등록
	
	//환철- 서비스 결제상태 코드 조회
	public List<Code> selectPaymentStateCode();

}
