package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Client;
import ksmart41_teamtest.mapper.ClientMapper;

@Service
@Transactional
public class ClientService {
	
	@Autowired
	private ClientMapper clientMapper;
	public ClientService (ClientMapper clientMapper) {
		this.clientMapper = clientMapper;
	}
	
	//[재천]외부 회원 등록
	public int addClient(Client client){
		int addClient = clientMapper.addClient(client);
		return addClient;
	}
	
	//[재천]외부 회원 전체 조회
	public List<Client> selectClientList(){
		List<Client> clientList = clientMapper.selectClientList();
		System.out.println("ClientService.java의 값" + clientList);
		return clientList;
	}
	
	//[재천]외부 회원정보 조회
	public Client ClientInfo(String clientId) {
		return clientMapper.ClientInfo(clientId);
	}
}
