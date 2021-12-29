package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.InvoiceList;
import ksmart41_teamtest.mapper.InvoiceMapper;

@Service
@Transactional
public class InvoiceListService {

	@Autowired
	private InvoiceMapper invoiceMapper;
	
	public InvoiceListService(InvoiceMapper invoiceMapper) {
		this.invoiceMapper = invoiceMapper;
	}
	
	public List<InvoiceList> getInvoiceList() {
		List<InvoiceList> invoiceList = invoiceMapper.getInvoiceList();
		return invoiceList;
	}
	

}
