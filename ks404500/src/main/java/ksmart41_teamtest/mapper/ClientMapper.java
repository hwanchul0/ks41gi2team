package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Client;

@Mapper
public interface ClientMapper {

	//[재천]회원 등록
	public int addClient(Client client);
	
	//[재천]외부 회원정보 조회
	public Client ClientInfo (String clientId);
	
	//[재천]외부 회원조회
	public List<Client> selectClientList();
	
	}
