package com.mcc.interfaces.math;
import com.mcc.vo.DataFrame;


public interface Matrix {

	public DataFrame inverse(double[][] datas);
	
	public DataFrame transpose(double[][] datas);
	
	public DataFrame multiply(double[][] data1,double[][] data2);
	
	

}
