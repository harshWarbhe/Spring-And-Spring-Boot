package com.harsh.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.cfgs.AppConfig;
import com.harsh.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator1 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg", WishMessageGenerator.class);

		System.out.println("generator hashcode : " + generator.hashCode() + "\ngenerator1 hashcode : "
				+ generator1.hashCode() + "\ngenerator2 hashcode : " + generator2.hashCode());

		System.out.println("------------------------------------------------------");

		LocalDateTime ldt1 = ctx.getBean("dt", LocalDateTime.class);
		LocalDateTime ldt2 = ctx.getBean("dt", LocalDateTime.class);
		System.out.println("ldt1 :" + ldt1.hashCode() + " " + "ldt2 : " + ldt2.hashCode());

		System.out.println("------------------------------------------------------");

		LocalDateTime ldt3 = ctx.getBean("dt1", LocalDateTime.class);
		LocalDateTime ldt4 = ctx.getBean("dt1", LocalDateTime.class);
		System.out.println("ldt3 :" + ldt3.hashCode() + " " + "ldt4 : " + ldt4.hashCode());
	}
}
