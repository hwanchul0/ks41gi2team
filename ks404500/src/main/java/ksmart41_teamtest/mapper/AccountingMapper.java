package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;


@Mapper
public interface AccountingMapper {

	public List<GetInvoiceInfo> getAddByBizInvoice();
	
	//유경 - 개발사 세계 발행 자동증가 코드
	public InvoiceList getInvoiceCode();
	
	//유경 - 개발사 세계 발행 세부 코드증가
	public InvoiceList getInvoiceDetailCode();
	
	//유경 세계 등록
	public int addInvoiceByContract(InvoiceList invoiceList);
	
	//유경 세계 세부등록
	public int addDetailInvoiceByContract(InvoiceList invoiceList);
	
	//유경 - 수정할 세.계 정보 받아오기
	public InvoiceList getAmendInvoice(String invoiceCode);
	
	//유경 - 수정세.계발행 - update, 기존 발행내역에 수정사유 추가하기
	public int amendInvoicByDefault(InvoiceList invoiceList);
	
	//유경 - 수정세.계발행 - insesrt. 복사하여 수정하기
	public int addAmendInvoice(InvoiceList invoiceList);
	
	//유경 - 수정세.계발행 -detail
	public int addDetailAmendInvoice(InvoiceList invoiceList);

}
