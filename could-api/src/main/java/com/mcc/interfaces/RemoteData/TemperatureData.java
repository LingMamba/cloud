package com.mcc.interfaces.RemoteData;

import java.util.List;

import com.mcc.vo.ZzY2;

public interface TemperatureData {
	public List<ZzY2> getByCityAndPeriod(String cityn,String period);
}
