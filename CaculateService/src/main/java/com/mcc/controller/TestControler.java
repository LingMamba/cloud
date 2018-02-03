package com.mcc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mcc.impl.math.LinearImpl;
import com.mcc.vo.DataFrame;


@RestController
public class TestControler {
	@RequestMapping(value = "/linear/test", method = RequestMethod.GET)
	public DataFrame index(@RequestBody DataFrame df){
		
		double[][] x = {{1,2},{3,4}};
		double[] y = {1,2};
		DataFrame haha = new LinearImpl().matrixMultiply(x, y);		

		return haha;
		
	}
}
