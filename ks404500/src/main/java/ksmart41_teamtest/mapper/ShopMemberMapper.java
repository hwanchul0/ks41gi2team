package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ShopMember;

@Mapper
public interface ShopMemberMapper {

	//[재천]회원 등록
	public int addShopMember(ShopMember shopMember);
	
	//[재천]외부 회원조회
	public List<ShopMember> selectShopMemberList();
	
	//[재천]외부 회원 수정
	public int modifyClientMember(ShopMember shopMember);
	
	//[재천]외부 회원 정보 조회
	public ShopMember ShopMemberInfo(String shopMemberId);
	
	//[재천]외부 회원 정보 삭제
	public int deleteClientMember(ShopMember shopMember);
	
	//[재천]중복 확인
	public int idCheck(String shopMemberId);
	
	//재천 상태확인
	public ShopMember selectShopMemberState(String shopMemberId);
	
	}

