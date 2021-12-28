package ksmart41_teamtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Client;

@Mapper
public interface ClientMapper {

	//회원 등록
	public int addClient(Client client);
	
}
