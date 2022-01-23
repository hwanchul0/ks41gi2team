package ksmart41_teamtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.mapper.MyPageMapper;

@Service
@Transactional
public class MyPageService {
	
	@Autowired
	private MyPageMapper myPageMapper;
	
	public int modifyMyPage(Member member) {
		return myPageMapper.modifyMyPage(member);
	}
	
	//[재천]회원정보 조회
	public Member MemberInfo(String memberId) {
		return myPageMapper.MemberInfo(memberId);
	}
	
	//회원상태체크
	public Member selectMemberStatus(String memberId) {
		return myPageMapper.selectMemberStatus(memberId);
	}
	
	public int modifystatus(Member member) {
		return myPageMapper.modifystatus(member);
	}
	
}
