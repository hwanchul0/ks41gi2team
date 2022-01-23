package ksmart41_teamtest.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart41_teamtest.dto.ServicePayment;

@Mapper
public interface SwIndexMapper {

	ServicePayment indexSwGetServiceAmount();

	HashMap<String, Object> indexSwGetWatingAmount();

	HashMap<String, Object> indexSwGeClientAmount();

	List<HashMap<String, Object>> indexSwGeServicePercent();

}
