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
	
	//[재천]쇼핑몰 거래처 등록
	public int addBusinessInfo(ShopBusinessInfo shopBusinessInfo) {
		int addbusinessinfo = shopBusinessInfoMapper.addBusinessInfo(shopBusinessInfo);
		return addbusinessinfo;
	}
	
	//[재천]쇼핑몰 거래처 수정
	public int modifyBusinessInfo(ShopBusinessInfo shopClientCode) {
		return shopBusinessInfoMapper.modifyBusinessInfo(shopClientCode);
	}
	
	//[재천] 쇼핑몰 거래처 코드 조회
	public ShopBusinessInfo selectBusinessInfo(String shopClientCode) {
		return shopBusinessInfoMapper.selectBusinessInfo(shopClientCode);
	}
	
	//[재천] 쇼핑몰 거래처 코드 삭제
	public int deleteBusinessInfo(ShopBusinessInfo shopBusinessInfo) {
		return shopBusinessInfoMapper.deleteBusinessInfo(shopBusinessInfo);
	}
}
