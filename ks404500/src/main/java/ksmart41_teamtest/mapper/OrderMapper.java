package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Order;

@Mapper
public interface OrderMapper {
	
	//유성 주문내역 조회
	public List<Order> getOrder();
	public Order getOrderList(String shopOrderCode);
	//유성 주문내역 수정(삭제)
	public int modifyOrder(Order shopOrderCode);


}
