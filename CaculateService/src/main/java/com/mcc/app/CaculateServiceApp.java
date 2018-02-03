package com.mcc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.mcc" })
//@MapperScan(basePackages="com.sinohealth.dsc.mapper")
public class CaculateServiceApp {

	
	public static void main(String[] args) {
		SpringApplication.run(CaculateServiceApp.class, args); //111111
		System.out.println("haha");

   
	} 
	
	
	
	
	

}
