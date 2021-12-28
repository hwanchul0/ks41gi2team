package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.Request;
import ksmart41_teamtest.mapper.RequestMapper;

@Service
@Transactional
public class RequestService {

	private RequestMapper requestMapper;

	public RequestService(RequestMapper requestMapper) {
		this.requestMapper = requestMapper;
		}
	
	// 계약요청 목록 조회(장바구니)
	public List<Request> getRequestList(){
		List<Request> requestList = requestMapper.getRequestList();
		System.out.println("RequestService : " + requestList);
		return requestList;
	}
}

