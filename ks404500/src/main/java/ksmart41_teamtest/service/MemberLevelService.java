package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.MemberLevel;
import ksmart41_teamtest.mapper.MemberLevelMapper;

@Service
@Transactional

public class MemberLevelService {
	
	@Autowired
	private MemberLevelMapper memberLevelMapper;
	public MemberLevelService(MemberLevelMapper memberLevelMapper) {
		this.memberLevelMapper = memberLevelMapper;
	}
	// 내부 권한 등록 -유성 -
	public int addMemberLevel(MemberLevel memberLevel)	{
		int addMemberLevel = memberLevelMapper.addMemberLevel(memberLevel);
		return addMemberLevel;
		
	}
	
	
	
	
	//내부 권한 조회-유성 -
	public List<MemberLevel> getMemberLevel() {
		List<MemberLevel> memberLevel = memberLevelMapper.getMemberLevel();
		return memberLevel;
	}

}
