package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.GetInvoiceInfo;
import ksmart41_teamtest.dto.InvoiceList;


@Mapper
public interface AccountingMapper {

	public List<GetInvoiceInfo> getAddByBizInvoice();
	
	//유경 - 개발사 세계 발행 자동증가 코드
	public InvoiceList getInvoiceCode();
	
	//유경 - 개발사 세계 발행 세부 코드증가
	public InvoiceList getInvoiceDetailCode();


}
