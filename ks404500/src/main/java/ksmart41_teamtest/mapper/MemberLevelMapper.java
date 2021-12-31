package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.MemberLevel;

@Mapper
public interface MemberLevelMapper {
	
	//내부 권한 등록
	public int addMemberLevel(MemberLevel memberLevel);
	
	//내부 권한 조회
	public List<MemberLevel> getMemberLevel();

}
