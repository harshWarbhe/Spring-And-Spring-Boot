package com.harsh.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harsh.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {

		//create ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/harsh/cfgs/ApplicationContext.xml");
		
		//get target spring beans class obj ref
		SeasonFinder sf = ctx.getBean("sf", SeasonFinder.class);
		
		//invoke b.logic method
		String result = sf.showSeasonName();
		System.out.println(result);
		
		ctx.close();
 	}
}
