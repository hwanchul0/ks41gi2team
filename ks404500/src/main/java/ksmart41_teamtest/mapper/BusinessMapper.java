package ksmart41_teamtest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.Business;

@Mapper
public interface BusinessMapper {

	public List<Business> getBusiness();
}
