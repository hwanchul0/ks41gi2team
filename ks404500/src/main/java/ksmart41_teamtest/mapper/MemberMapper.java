package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Member;

@Mapper
public interface MemberMapper {

	//[재천]내부직원 등록
	public int addMember(Member member);
	
	//[재천]내부직원 정보 조회
	public Member MemberInfo(String memberId);
	
	//[재천]내부직원 조회
	public List<Member> selectMemberList();
	
	//[재천]내부직원 삭제
	public int deleteMember(Member member);

	//[재천]내부직원 수정
	public int modifyMember(Member member);
}

