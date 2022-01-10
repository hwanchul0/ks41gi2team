package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.MainBusinessCode;

@Mapper
public interface MainBusinessCodeMapper {
	
	public List<MainBusinessCode> getMainBusinessCode();


}
