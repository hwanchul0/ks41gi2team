package ksmart41_teamtest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Order;
import ksmart41_teamtest.dto.ShopCategoryOrder;

@Mapper
public interface OrderMapper {
	
	//유성 주문내역 조회
	public List<Order> getOrder();
	public Order getOrderList(String shopOrderCode);
	//유성 주문내역 수정(삭제)
	public int modifyOrder(Order shopOrderCode);
	
	//유경 - 쇼핑몰 상품주문 거래처 검색
	public List<HashMap<String, Object>> getShopBizInfo();
	
	//유경 
	public int addShopGoods(ShopCategoryOrder shopCategoryOrder);


}
