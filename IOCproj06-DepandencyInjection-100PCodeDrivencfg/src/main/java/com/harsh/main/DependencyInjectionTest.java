package com.harsh.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.WeekDaysFilter;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main() start");
		
		AnnotationConfigApplicationContext cxt  = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring beans class obj ref
		WeekDaysFilter wdf =cxt.getBean("wdf", WeekDaysFilter.class);
		
		String showMessage = wdf.showMessage("harsh");
		System.out.println(showMessage);
		
		cxt.close();
		System.out.println("DependencyInjectionTest.main() end");

	}
}
