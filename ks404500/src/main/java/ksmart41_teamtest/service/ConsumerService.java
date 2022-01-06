package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Consumer;
import ksmart41_teamtest.mapper.ConsumerMapper;

@Service
@Transactional
public class ConsumerService {

	@Autowired
	private ConsumerMapper consumerMapper;
	public ConsumerService(ConsumerMapper consumerMapper) {
		this.consumerMapper = consumerMapper;
	}
	
	//[재천]소비자 전체 조회
	public List<Consumer> selectConsumerList(){
		List<Consumer> consumerlist = consumerMapper.selectConsumerList();
		return consumerlist;
	}
	
}
