package ksmart41_teamtest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.GetInvoiceInfo;
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

}
