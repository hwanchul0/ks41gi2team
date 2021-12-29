package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.SwIsListCode;
import ksmart41_teamtest.mapper.CodeMapper;

@Service
@Transactional
public class SwIsListService {
	
	@Autowired
	private CodeMapper codeMapper;
	public SwIsListService(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}
	
	public List<SwIsListCode> getSwIsListCode() {
		List<SwIsListCode> swIsListCode = codeMapper.getSwIsListCode();
		System.out.println(swIsListCode + "<--service");
		return swIsListCode;
	}

}
