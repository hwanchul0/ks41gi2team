package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.InvoiceReason;
import ksmart41_teamtest.dto.SwIsListCode;

@Mapper
public interface CodeMapper {
	
	public List<InvoiceReason> getInvoiceReason();

	public List<SwIsListCode> getSwIsListCode();
	



}
