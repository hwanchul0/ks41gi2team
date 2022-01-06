package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopBusinessInfo;
import ksmart41_teamtest.mapper.ShopBusinessInfoMapper;

@Service
@Transactional
public class ShopBusinessInfoService {

	
	@Autowired
	private ShopBusinessInfoMapper shopBusinessInfoMapper;
	public ShopBusinessInfoService(ShopBusinessInfoMapper shopBusinessInfoMapper) {
		this.shopBusinessInfoMapper = shopBusinessInfoMapper;
	}
	
	//[재천]쇼핑몰 거래처 전체 조회
	public List<ShopBusinessInfo> ShopBusinessList(){
		List<ShopBusinessInfo> businesslist = shopBusinessInfoMapper.ShopBusinessList();
		return businesslist;
	}
	
}
