package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.Business;

@Mapper
public interface BusinessMapper {
	// [유성]사업장 등록
	public int addBusinessRegistration(Business business);
	
	//[유성]사업장 전체 조회
	public List<Business> getBusiness();
	
	//[유성] 사업장 정보조회
	public Business getBusiness(String clientId);
	
	//[유성] 사업장 상세정보 조회
	public Business getDetailBusinessList(String clientId);
	
	//[유성] 사업장 수정
	public int modifyBusiness(Business business);
}
