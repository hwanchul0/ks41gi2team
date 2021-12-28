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
	
	//내부직원등록
	public int addMember(Member member) {
		int addMember = memberMapper.addMember(member);
		return addMember;
	}
	
	//내부직원 조회
	public List<Member> selectMemberList(){
		List<Member> memberList = memberMapper.selectMemberList();
		System.out.println("MemberService.java" + memberList);
		return memberList;
	}
} 
