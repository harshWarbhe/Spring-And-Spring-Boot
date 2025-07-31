package com.harsh.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.harsh.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig() :: 0 param constructor");
	}

	@Bean(name = "Idate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();

	}

}
