package ksmart41_teamtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Member;
import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.mapper.MyPageMapper;
import ksmart41_teamtest.mapper.MyPageMapperShop;

@Service
@Transactional
public class MyPageServiceShop {
	
	@Autowired
	private MyPageMapperShop myPageMapperShop;
	
	public int modifyMyPage(ShopMember shopMember) {
		return myPageMapperShop.modifyMyPage(shopMember);
	}
	
	//[재천]회원정보 조회
	public ShopMember MemberInfo(String shopMemberId) {
		return myPageMapperShop.MemberInfo(shopMemberId);
	}
	
	//회원상태체크
	public ShopMember selectMemberStatus(String shopMemberId) {
		return myPageMapperShop.selectMemberStatus(shopMemberId);
	}
	
	public int modifystatus(ShopMember shopMember) {
		return myPageMapperShop.modifystatus(shopMember);
	}
	
}
