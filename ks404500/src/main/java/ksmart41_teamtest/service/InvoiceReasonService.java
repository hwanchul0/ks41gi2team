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

	public List<InvoiceReason> getInvoiceReasonList() {
		List<InvoiceReason> invoiceReason = codeMapper.getInvoiceReason();
		System.out.println(invoiceReason+"<---service");
		return invoiceReason;
	}


}
