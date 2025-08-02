package com.harsh.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.PersonInfo;
import com.harsh.sbeans.PersonInfo1;


public class PropertiesfileTest {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonInfo resInfo = ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(resInfo);
		
		PersonInfo1 resInfo1 = ctx.getBean("pInfo1",PersonInfo1.class);
		resInfo1.showData();
		
		Environment environment = ctx.getEnvironment();
		System.out.println("os.name"+environment.getProperty("os.name"));

	}
}
