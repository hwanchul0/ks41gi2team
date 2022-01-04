package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.InvoiceList;

@Mapper
public interface InvoiceMapper {
	
	//유경- 개발사 세금계산서 목록조회
	public List<InvoiceList> getInvoiceList();
	
	//유경 - 세금계산서 상세조회
	public InvoiceList getInvoiceView(String invoiceCode);


}
