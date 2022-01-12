package ksmart41_teamtest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.LocalCode;
import ksmart41_teamtest.mapper.LocalCodeMapper;

@Service
@Transactional
public class LocalCodeService {

	@Autowired
	private LocalCodeMapper localCodeMapper;
	public LocalCodeService(LocalCodeMapper localCodeMapper) {
		this.localCodeMapper = localCodeMapper;
	}
	
	//[재천]지역 코드 등록
	public int addLocalCode(LocalCode localCode) {
		int addLocalCode = localCodeMapper.addLocalCode(localCode);
		return addLocalCode;
	}
	
	//[재천]지역 코드 전체 조회
	public List<LocalCode> selectLocalCodeList(){
		List<LocalCode> localcodeList = localCodeMapper.selectLocalCodeList();
		return localcodeList;
	}
	
	//[[재천]지역 코드 수정
	public int modifyLocalCode(LocalCode localCode) {
		return localCodeMapper.modifyLocalCode(localCode);
	}
	
	//[재천]지역 코드 조회
	public LocalCode selectLocalCodeInfo(String localCode) {
		return localCodeMapper.selectLocalCodeInfo(localCode);
	}
	
	//[재천]지역 코드 삭제
	public int deleteLocalCode(LocalCode localCode) {
		return localCodeMapper.deleteLocalCode(localCode);
	}
	
	//[재천]중복체크
	public int localCodeCheck (String localCode) {
		return localCodeMapper.localCodeCheck(localCode);
	}
	
}
