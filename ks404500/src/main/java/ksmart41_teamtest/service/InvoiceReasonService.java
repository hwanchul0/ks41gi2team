package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.mapper.CodeMapper;

@Service
@Transactional
public class InvoiceReasonService{
	
	@Autowired
	private CodeMapper codeMapper;
	
	public InvoiceReasonService(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}
	
	//유경 - 세금계산서 수정사유
	public List<InvoiceReason> getInvoiceReasonList() {
		List<InvoiceReason> invoiceReason = codeMapper.getInvoiceReason();
		//System.out.println(invoiceReason+"<---service");
		return invoiceReason;
	}


}
