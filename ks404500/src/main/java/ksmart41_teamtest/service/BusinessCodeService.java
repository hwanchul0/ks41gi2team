package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.BusinessCode;
import ksmart41_teamtest.mapper.BusinessCodeMapper;

@Service
@Transactional
public class BusinessCodeService {

	@Autowired
	private BusinessCodeMapper businessCodeMapper;
	public BusinessCodeService(BusinessCodeMapper businessCodeMapper) {
		this.businessCodeMapper = businessCodeMapper;
	}
	
	//[재천]거래처 구분 코드 등록
	public int addBusinessCode(BusinessCode businessCode) {
		int addBusinessCode = businessCodeMapper.addBusinessCode(businessCode);
		return addBusinessCode;
	}
	
	//[재천] 거래처 구분 코드 조회
	public List<BusinessCode> selectBusinessCodeList() {
		List<BusinessCode> businessCodeList = businessCodeMapper.selectBusinessCodeList();
		return businessCodeList;
	}
	
	//[재천] 거래처 구분 코드 수정
	public int modifyBusinessCode(BusinessCode businessCode) {
		return businessCodeMapper.modifyBusinessCode(businessCode);
	}
	
	//[재천] 거래처 구분 코드 조회
	public BusinessCode selectBusinessCodeInfo(String businessCode) {
		return businessCodeMapper.selectBusinessCodeInfo(businessCode);
	}
	
	//[재천] 거래처 구분 코드 삭제
	public int deleteBusinessCode(BusinessCode businessCode) {
		return businessCodeMapper.deleteBusinessCode(businessCode);
	}
	
	//[재천]거래처 구분 코드 중복 확인
	public int codeCheck(String businessCode) {
		return businessCodeMapper.codeCheck(businessCode);
	}
}
