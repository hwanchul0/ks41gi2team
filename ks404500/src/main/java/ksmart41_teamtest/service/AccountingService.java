package ksmart41_teamtest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;
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
	
}
