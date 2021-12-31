package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	//[재천]내부직원등록
	public int addMember(Member member) {
		int addMember = memberMapper.addMember(member);
		return addMember;
	}
	
	//[재천]내부직원 전체 조회
	public List<Member> selectMemberList(){
		List<Member> memberList = memberMapper.selectMemberList();
		System.out.println("MemberService.java" + memberList);
		return memberList;
	}
	
	//[재천]회원정보 조회
	public Member MemberInfo(String memberId) {
		return memberMapper.MemberInfo(memberId);
	}
	
	//[재천]내부 직원 삭제
	public int deleteMember(Member member) {
		return memberMapper.deleteMember(member); 
	}
	
	//[재천]내부 직원 수정
	public int modifyMember(Member member) {
		return memberMapper.modifyMember(member);
	}
} 
