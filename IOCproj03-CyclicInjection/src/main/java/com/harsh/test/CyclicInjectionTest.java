package com.harsh.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harsh.sbeans.A;

public class CyclicInjectionTest {
	public static void main(String[] args) {
		//crate ioc container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/harsh/cfgs/ApplicationContext.xml");
		
		//get spring bean class object ref
		A a1 = ctx.getBean("a1",A.class);
		
		System.out.println(a1);
		
		ctx.close();
	}
}
