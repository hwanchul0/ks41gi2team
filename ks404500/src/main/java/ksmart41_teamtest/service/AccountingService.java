package ksmart41_teamtest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.dto.SwTotalAccounting;
import ksmart41_teamtest.mapper.AccountingMapper;

@Service
@Transactional
public class AccountingService {
	
	@Autowired
	private AccountingMapper accountingMapper;
	
	public List<GetInvoiceInfo> getAddByBizInvoice() {
		List<GetInvoiceInfo> getInvoiceInfo = accountingMapper.getAddByBizInvoice();
		//System.out.println(getInvoiceInfo);
		return getInvoiceInfo;
	}
	
	//유경 세계 발행 기본코드증가
	public InvoiceList getInvoiceCode() {
		InvoiceList invoiceCode = accountingMapper.getInvoiceCode();
		return invoiceCode;
	}
	//유경 세계 발행 세부코드증가
	public InvoiceList getInvoiceDetailCode() {
		InvoiceList invoiceDetailCode = accountingMapper.getInvoiceDetailCode();
		return invoiceDetailCode;
	}
	
	//유경 세계 등록
	public int addInvoiceByContract(InvoiceList invoiceList) {
		return accountingMapper.addInvoiceByContract(invoiceList);
		
	}
	
	//유경 세계 세부등록
	public int addDetailInvoiceByContract(InvoiceList invoiceList) {
		return accountingMapper.addDetailInvoiceByContract(invoiceList);
	}
	
	//유경 - 수정할 세.계 정보 받아오기
	public InvoiceList getAmendInvoice(String invoiceCode) {
		return accountingMapper.getAmendInvoice(invoiceCode);
	}
	
	//유경 - 세금계산서 수정 update
	public int amendInvoicByDefault(InvoiceList invoiceList) {
		int result = accountingMapper.amendInvoicByDefault(invoiceList);
		return result;
	}
	
	//유경 - 세금계산서 수정 발행 insert
	public int addAmendInvoice(InvoiceList invoiceList) {
		return accountingMapper.addAmendInvoice(invoiceList);
		
	}
	//유경 - 세금계산서 수정 발행 Detailinsert
	public int addDetailAmendInvoice(InvoiceList invoiceList) {
		return accountingMapper.addDetailAmendInvoice(invoiceList);
	}
	//유경 - 통합회계 매출 대상 조회
	public List<SwTotalAccounting> addTotalAccountingIncome() {
		 List<SwTotalAccounting> SwTotalIncome = accountingMapper.addTotalAccountingIncome();
		return SwTotalIncome;
	}

	//유경 - 통합회계 매출 대상 등록
	public int addTotalByIncome(SwTotalAccounting swTotalAccounting) {
		int result = accountingMapper.addTotalByIncome(swTotalAccounting);
		return result;
		
	}
	
	//유경 - 통합회계 비용 대상 조회
	public List<SwTotalAccounting> addTotalAccountingExpense() {
		List<SwTotalAccounting> SwTotalExpense = accountingMapper.addTotalAccountingExpense();
		return SwTotalExpense;
	}
	
	//유경 - 통합회계 비용 대상 등록
	public int addTotalByExpense(SwTotalAccounting swTotalAccounting) {
		int result = accountingMapper.addTotalByExpense(swTotalAccounting);
		return result;
		
	}
	
	//유경 - 개발사 통합회계 조회
	public List<SwTotalAccounting> selectTotalAccounting() {
		List<SwTotalAccounting> swAccounting= accountingMapper.selectTotalAccounting();
		return swAccounting;
	}
	
	//유경 - 개발사 2021년 분기별 매출 조회
	public List<SwTotalAccounting> selectSwIncome() {
		List<SwTotalAccounting> sw2021Sales = accountingMapper.selectSwIncome();
		return sw2021Sales;
	}
	
	//유경 - 개발사 2021년 분기별 비용 조회
	public List<SwTotalAccounting> selectSwExpense() {
		List<SwTotalAccounting> sw2021Expense = accountingMapper.selectSwExpense();
		return sw2021Expense;
	}
	
}
