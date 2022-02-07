package ksmart41_teamtest.mapper;

import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.Member;

@Mapper
public interface MyPageMapper {
	
	//[재천]내부직원 정보 조회
	public Member MemberInfo(String memberId);
	
	public int modifyMyPage(Member member);
	
	//회원상태체크
	public Member selectMemberStatus(String memberId);
	
	public int modifystatus(Member member);
	
	
}
