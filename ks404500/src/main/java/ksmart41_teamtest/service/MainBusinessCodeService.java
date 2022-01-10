package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.MainBusinessCode;
import ksmart41_teamtest.mapper.MainBusinessCodeMapper;

@Service
@Transactional
public class MainBusinessCodeService {
	
	@Autowired
	private MainBusinessCodeMapper mainBusinessCodeMapper;
	
	public MainBusinessCodeService(MainBusinessCodeMapper mainBusinessCodeMapper) {
		this.mainBusinessCodeMapper = mainBusinessCodeMapper;
	}
	// 유성 사업장 대표코드 전체조회 
	public List<MainBusinessCode> getMainBusinessCode() {
		List<MainBusinessCode> mainBusinessCode = mainBusinessCodeMapper.getMainBusinessCode();
		return mainBusinessCode;
	}
	
	// 유성 사업장 대표코드 조회
	public MainBusinessCode	MainBusinessCodeInfo(String mainBusinessCode) {
		return mainBusinessCodeMapper.MainBusinessCodeInfo(mainBusinessCode);
	}
	
	// 유성 사업장 대표코드 등록 
	public int addMainBusinessCode(MainBusinessCode	mainBusinessCode) {
		int addMainBusinessCode = mainBusinessCodeMapper.addMainBusinessCode(mainBusinessCode);
		return addMainBusinessCode;
		
	}
	
	// 유성 사업장 대표코드 수정 
	public int modifyMainBusinessCode(MainBusinessCode mainBusinessCode)	{
		return mainBusinessCodeMapper.modifyMainBusinessCode(mainBusinessCode);
	}
}
