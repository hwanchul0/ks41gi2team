package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ClientLevel;
import ksmart41_teamtest.mapper.ClientLevelMapper;

@Service
@Transactional

public class ClientLevelService {
	
	@Autowired
	private ClientLevelMapper clientLevelMapper;
	
	public ClientLevelService(ClientLevelMapper clientLevelMapper)	{
		this.clientLevelMapper = clientLevelMapper;
	}
	public List<ClientLevel> getClientLevel() {
		List<ClientLevel> clientLevel = clientLevelMapper.getClientLevel();
		return clientLevel;
	}

}
