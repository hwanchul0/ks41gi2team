package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Consumer;

@Mapper
public interface ConsumerMapper {

	//[재천]소비자 전체 조회
	public List<Consumer> selectConsumerList();
}
