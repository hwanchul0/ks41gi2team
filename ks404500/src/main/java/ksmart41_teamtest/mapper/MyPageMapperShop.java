package ksmart41_teamtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopMember;

@Mapper
public interface MyPageMapperShop {
	
	public ShopMember MemberInfo(String shopMemberId);
	
	public int modifyMyPage(ShopMember shopMember);
	
	public ShopMember selectMemberStatus(String shopMemberId);
	
	public int modifystatus(ShopMember shopMember);
}
