package com.harsh.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.IEngine;
import com.harsh.sbeans.Vehicle;

public class FactoryBeanTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle vbean = ctx.getBean("vehicle", Vehicle.class);
		
		vbean.journey("warora","hyd");
		
		System.out.println("=======================================================================");
		
		IEngine engg = ctx.getBean("eFactory",IEngine.class);
		
		System.out.println("engg type : "+engg.getClass());

	}

}
