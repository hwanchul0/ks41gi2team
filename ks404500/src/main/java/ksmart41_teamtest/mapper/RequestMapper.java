package ksmart41_teamtest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ksmart41_teamtest.dto.Request;

@Mapper
public interface RequestMapper {
	
	// 계약요청 전체 리스트 조회(Sw)
	public List<Request> getAllRequestList();

	// 계약요청 리스트 조회
	public List<Request> getRequestList();
	
	// 계약요청 상세정보 조회
	public Request getDetailRequestList(String contractManageCode);

	

}
