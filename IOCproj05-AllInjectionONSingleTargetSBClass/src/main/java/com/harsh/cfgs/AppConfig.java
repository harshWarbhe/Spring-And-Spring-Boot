package com.harsh.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.harsh.sbeans")
public class AppConfig {

	public AppConfig() {
		super();
		System.out.println("AppConfig() :: 0 param constructor");
	}

	// pre-define class as spring bean class
	@Bean(name = "Idate1")
	public LocalDate CreateDate1() {
		System.out.println("AppConfig.CreateDate1()");
		return LocalDate.now();
	}

	@Bean(name = "Idate2")
	public LocalDate CreateDate2() {
		System.out.println("AppConfig.CreateDate2()");
		return LocalDate.of(2025, 7, 30); // sys date
	}

	@Bean(name = "Idate3")
	public LocalDate CreateDate3() {
		System.out.println("AppConfig.CreateDate3()");
		return LocalDate.of(2002, 10, 20); // custom date
	}

	@Bean(name = "Idate4")
	public LocalDate CreateDate4() {
		System.out.println("AppConfig.CreateDate4()");
		return LocalDate.of(2002, 5, 18); // custom date
	}

	@Bean
	public LocalTime createTime() {
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();

	}

}
