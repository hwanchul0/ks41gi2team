package ksmart41_teamtest.service;

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
	
	//외부 회원 등록
	public int addClient(Client client){
		int addClient = clientMapper.addClient(client);
		return addClient;
	}
}
