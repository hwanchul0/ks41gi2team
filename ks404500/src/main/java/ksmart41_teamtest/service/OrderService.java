package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	// 유성 쇼핑몰 주문내역 조회 
	public List<Order> getOrder()	 {
		List<Order>	order = orderMapper.getOrder();
		return order;
	}
	// 유성 주문내역 조회(수정 들어가기)
	public Order getOrderList(String shopOrderCode) {
		Order getOrderList = orderMapper.getOrderList(shopOrderCode);
		return getOrderList;
	}
	// 유성 쇼핑몰 주문내역 수정(삭제)
	public int modifyOrder(Order shopOrderCode) {
		return orderMapper.modifyOrder(shopOrderCode);
	}

}
