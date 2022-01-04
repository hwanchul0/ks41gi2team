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
	public List<Order> getOrder()	 {
		List<Order>	order = orderMapper.getOrder();
		return order;
	}

}
