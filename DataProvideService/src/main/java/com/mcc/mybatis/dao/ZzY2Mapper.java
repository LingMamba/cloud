package com.mcc.mybatis.dao;

import java.util.List;

import com.mcc.vo.ZzY2;

@Mapper
public interface ZzY2Mapper {
	public List<ZzY2> getTemperatureSample(String cityn,String period);
	
}
