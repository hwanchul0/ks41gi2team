package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart41_teamtest.dto.ShopIsListCode;
import ksmart41_teamtest.mapper.CodeMapper;

@Service
public class ShopCodeServiceJYK {
	
	@Autowired
	private CodeMapper codeMapper;
	
	//유경 - 쇼핑몰 계정과목조회
	public List<ShopIsListCode> getSelectShopIsListCode() {
		List<ShopIsListCode> shopIsListCode = codeMapper.getSelectShopIsListCode();
		return shopIsListCode;
	}
	
	//유경 - 쇼핑몰 계정과목마감 수정
	public int shopModifyIsListCode(ShopIsListCode shopIsCode) {
		return codeMapper.ShopModifyIsListCode(shopIsCode);		
	}
	
	//유경 - 쇼핑몰 계정과목마감 
	public ShopIsListCode getShopIsCodeByShopIsListCode(String shopIsCode) {
		return codeMapper.getShopIsCodeByShopIsListCode(shopIsCode);
	}

}
