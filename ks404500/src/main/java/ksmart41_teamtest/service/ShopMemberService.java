package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopMember;
import ksmart41_teamtest.mapper.ShopMemberMapper;

@Service
@Transactional
public class ShopMemberService {
	
	@Autowired
	private ShopMemberMapper shopMemberMapper;
	public ShopMemberService (ShopMemberMapper shopMemberMapper) {
		this.shopMemberMapper = shopMemberMapper;
	}
	
	//[재천]외부 회원 등록
	public int addShopMember(ShopMember shopMember){
		int addShopMember = shopMemberMapper.addShopMember(shopMember);
		return addShopMember;
	}
	
	//[재천]외부 회원 전체 조회
	public List<ShopMember> selectShopMemberList(){
		List<ShopMember> shopmemberlist = shopMemberMapper.selectShopMemberList();
		System.out.println("ClientService.java의 값" + shopmemberlist);
		return shopmemberlist;
	}
	
	//[재천]외부 회원정보 조회
	public ShopMember ShopMemberInfo(String shopMemberId) {
		return shopMemberMapper.ShopMemberInfo(shopMemberId);
	}
	
	//[재천]외부 회원정보 수정
	public int modifyClientMember(ShopMember shopMember) {
		return shopMemberMapper.modifyClientMember(shopMember);
	}
	
	//[재천]외부 회원 삭제
	public int deleteClient(ShopMember shopMember) {
		return shopMemberMapper.deleteClientMember(shopMember);
	}
	
	//[재천]외부 회원 중복 확인
	public int idCheck(String shopMemberId) {
		return shopMemberMapper.idCheck(shopMemberId);
	}
}
