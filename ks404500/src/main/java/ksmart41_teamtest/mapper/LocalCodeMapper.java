package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.LocalCode;

@Mapper
public interface LocalCodeMapper {
	
	//[재천]지역 코드 등록
	public int addLocalCode(LocalCode localCode);
	
	//[재천]지역 코드 전체 조회
	public List<LocalCode> selectLocalCodeList();
	
	//[재천] 지역 코드 수정
	public int modifyLocalCode(LocalCode localCode);
	
	//[재천] 지역 코드 정보 조회
	public LocalCode selectLocalCodeInfo(String localCode);
	
	//[재천]
	public int deleteLocalCode(LocalCode localCode);
}

