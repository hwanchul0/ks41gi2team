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
	
	public List<MainBusinessCode> getMainBusinessCode() {
		List<MainBusinessCode> mainBusinessCode = mainBusinessCodeMapper.getMainBusinessCode();
		return mainBusinessCode;
	}

}
