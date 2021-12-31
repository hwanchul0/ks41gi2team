package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.GetInvoiceInfo;


@Mapper
public interface AccountingMapper {

	public List<GetInvoiceInfo> getAddByBizInvoice();


}
