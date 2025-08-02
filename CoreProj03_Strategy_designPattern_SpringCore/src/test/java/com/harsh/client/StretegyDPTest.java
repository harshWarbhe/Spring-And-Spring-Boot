package com.harsh.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.config.AppConfig;
import com.harsh.sbeans.Flipkart;

public class StretegyDPTest {

	public static void main(String[] args) {
		
		//create IOC container 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//GET target spring been class obj
		Flipkart fpktBean = ctx.getBean("fpkt",Flipkart.class);
		
		String shopping = fpktBean.shopping(new String[]{"Shirt","pant"}, new double[] {1000.0,1599.0} );
		
		System.out.println(shopping);
	}
}
