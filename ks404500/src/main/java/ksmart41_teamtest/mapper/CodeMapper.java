package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

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
	


}
