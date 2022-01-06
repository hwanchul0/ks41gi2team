package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopBusinessInfo;

@Mapper
public interface ShopBusinessInfoMapper {

	//[재천]쇼핑몰 거래처 전체 조회
	public List<ShopBusinessInfo> ShopBusinessList();
}
