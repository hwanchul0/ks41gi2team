package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.MainBusinessCode;

@Mapper
public interface MainBusinessCodeMapper {
	//유성 사업장 대표코드 조회 
	public List<MainBusinessCode> getMainBusinessCode();

	//유성 사업장 대표코드 등록 
	public int addMainBusinessCode(MainBusinessCode	mainBusinessCode);

}
