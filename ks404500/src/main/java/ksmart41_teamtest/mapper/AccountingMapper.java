package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.dto.SwTotalAccounting;


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
	
	//유경 - 통합회계 매출 등록대상 조회
	public List<SwTotalAccounting> addTotalAccountingIncome();
	
	//유경 - 통합회계 매출 등록대상 등록
	public int addTotalByIncome(SwTotalAccounting swTotalAccounting);
	
	//유경 - 통합회계 비용 등록대상 조회
	public List<SwTotalAccounting> addTotalAccountingExpense();

	//유경 - 통합회계 비용 등록대상 등록
	public int addTotalByExpense(SwTotalAccounting swTotalAccounting);
	
	//유경 - 개발사 통합회계 조회
	public List<SwTotalAccounting> selectTotalAccounting();
	
	//유경 - 개발사 2021년 분기별 매출 조회
	public List<SwTotalAccounting> selectSwIncome();

	//유경 - 개발사 2021년 분기별 비용 조회
	public List<SwTotalAccounting> selectSwExpense();

}
