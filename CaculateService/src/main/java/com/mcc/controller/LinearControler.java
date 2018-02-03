package com.mcc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mcc.impl.math.LinearImpl;
import com.mcc.vo.DataFrame;


@RestController
public class LinearControler {
	@RequestMapping(value = "/linear/multiply", method = RequestMethod.POST)
	public DataFrame index(@RequestBody DataFrame df){
		
		double[][] x = df.getDatas();
		double[] y = df.getData();
		DataFrame haha = new LinearImpl().matrixMultiply(x, y);		

		return haha;
		
	}
}
