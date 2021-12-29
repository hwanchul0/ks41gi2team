package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.InvoiceList;

@Mapper
public interface InvoiceMapper {

	public List<InvoiceList> getInvoiceList();


}
