package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopModal;
@Mapper
public interface ShopModalMapper {
	// client 내 사업장 대표코드 조회
	public List<ShopModal> getRequestModal();

}
