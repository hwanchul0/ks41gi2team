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
	
	/*유경 */
	public List<SwIsListCode> getSwIsListCode() {
		List<SwIsListCode> swIsListCode = codeMapper.getSwIsListCode();
		//System.out.println(swIsListCode + "<--service");
		return swIsListCode;
	}
	
	/*유경 - 손익계정 사용여부 수정*/
	public int modifyIsListCode(SwIsListCode swiscode) {
		return codeMapper.modifyIsListCode(swiscode);
	}
	
	/*유경  손익계정정->수정화면에서 값 가져오기*/
	public SwIsListCode getSwIsCodeBySwIsListCode(String swIsCode) {
		return codeMapper.getSwIsCodeBySwIsListCode(swIsCode);
	}

}
