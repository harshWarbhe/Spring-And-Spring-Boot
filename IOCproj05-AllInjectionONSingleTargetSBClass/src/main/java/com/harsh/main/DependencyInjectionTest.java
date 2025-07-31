package com.harsh.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.WeekDaysFilter;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main() start");


		//create ioc container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring beans class obj ref
		WeekDaysFilter wdf = ctx.getBean("wdf", WeekDaysFilter.class);
		
		//invoke b.logic method
		String result = wdf.showMessage("harsh");
		System.out.println(result);
		
		ctx.close();
		System.out.println("DependencyInjectionTest.main() end");

 	}
}
