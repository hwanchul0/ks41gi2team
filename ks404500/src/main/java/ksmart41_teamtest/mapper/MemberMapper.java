package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Member;

@Mapper
public interface MemberMapper {

	//내부직원 등록
	public int addMember(Member member);
	
	//내부직원 조회
	public List<Member> selectMemberList();
}

