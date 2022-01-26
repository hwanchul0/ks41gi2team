package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.MainBusinessCode;

@Mapper
public interface MainBusinessCodeMapper {
	//유성 사업장 대표코드 전체 조회 
	public List<MainBusinessCode> getMainBusinessCode();
	
	//유성 사업장 대표코드 조회 
	public MainBusinessCode mainBusinessCodeInfo(String mainBusinessCode);

	//유성 사업장 대표코드 등록 
	public int addMainBusinessCode(MainBusinessCode	mainBusinessCode);

	//유성 사업장 대표코드 수정 
	public int modifyMainBusinessCode(MainBusinessCode mainBusinessCode);
	
	//유성 사업장 대표코드 삭제 
	public int deleteMainBusinessCode(MainBusinessCode mainBusinessCode);
	
	//유성 merge 코드
	public List<MainBusinessCode> getMergeCode();
	
	//유성 사업장 대표코드 중복확인 
	public int codeCheck(String mainBusinessCode);
}
