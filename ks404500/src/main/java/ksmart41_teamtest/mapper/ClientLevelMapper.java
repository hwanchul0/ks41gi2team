package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ClientLevel;

@Mapper
public interface ClientLevelMapper {
	
	public List<ClientLevel> getClientLevel();

}
