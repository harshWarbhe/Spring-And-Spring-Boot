package com.harsh.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.CheckVoterEligibilty;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CheckVoterEligibilty voter = ctx.getBean("voter",CheckVoterEligibilty.class);
		
		try {
			String result = voter.checkEligibilty();
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

