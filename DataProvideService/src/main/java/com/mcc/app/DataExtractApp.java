package com.mcc.app;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EnableEurekaClient
@ComponentScan(basePackages = { "com.mcc"})
@MapperScan(basePackages="com.mcc.mybatis.dao")
public class DataExtractApp {

	public static void main(String[] args) {
		SpringApplication.run(DataExtractApp.class, args); //
		

		
		System.out.println("haha");
		
//		double[][] x = { { 2,3 }, { 2,4 }, {2,5 }, { 2,6 }, {2,7 }, };
//		double[] y = { 2, 3, 4, 5, 6 };
//		
//
//		String haha = new LinearImpl().matrixMultiply(x, y);
//		System.out.println(haha);

	} 
	
	
	
	
	

}
