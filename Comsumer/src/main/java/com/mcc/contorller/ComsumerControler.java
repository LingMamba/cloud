package com.mcc.contorller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcc.vo.DataFrame;


@RestController
public class ComsumerControler {
	@RequestMapping(value = "/matrix/inverse", method = RequestMethod.GET)
	public String matrixInverse(@RequestBody DataFrame df){
		

		return "";

	}
	
	

	
	
	
	
	
	
	
	
	
}
