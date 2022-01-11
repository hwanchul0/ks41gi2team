package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopBusinessInfo;

@Mapper
public interface ShopBusinessInfoMapper {

	//[재천]쇼핑몰 거래처 전체 조회
	public List<ShopBusinessInfo> ShopBusinessList();
	
	//[재천]쇼핑몰 거래처 등록
	public int addBusinessInfo(ShopBusinessInfo shopBusinessInfo);
	
	//[재천]쇼핑몰 거래처 수정
	public int modifyBusinessInfo(ShopBusinessInfo shopClientCode);
	
	//[재천]쇼핑몰 거래처 코드 조회
	public ShopBusinessInfo selectBusinessInfo(String shopClientCode);
	
	//[재천]쇼핑몰 거래처 코드 삭제
	public int deleteBusinessInfo(ShopBusinessInfo shopBusinessInfo);
}
