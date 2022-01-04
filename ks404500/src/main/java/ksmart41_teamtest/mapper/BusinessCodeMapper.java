package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.BusinessCode;

@Mapper
public interface BusinessCodeMapper {
	
	//[재천] 거래처 구분 코드 등록
	public int addBusinessCode(BusinessCode BusinessCode);
	
	//[재천] 거래처 구분 코드 목록 전체 조회
	public List<BusinessCode> selectBusinessCodeList();
	
	//[재천] 거래처 구분 코드 목록 수정
	public int modifyBusinessCode(BusinessCode businessCode);
	
	//[재천] 거래처 구분 코드 정보 조회
	public BusinessCode selectBusinessCodeInfo(String businessCode);
	
	//[재천] 거래처 구분 코드 삭제
	public int deleteBusinessCode(BusinessCode businessCode);
}
