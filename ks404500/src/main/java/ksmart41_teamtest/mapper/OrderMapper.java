package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.dto.ShopAddPaymentCheck;

@Mapper
public interface OrderMapper {
	
	//유성 주문내역 조회
	public List<Order> getOrder();
	


}
