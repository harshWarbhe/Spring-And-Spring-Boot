package com.harsh.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.harsh.sbeans")
public class AppConfig {

	public AppConfig() {
		super();
		System.out.println("AppConfig :: 0 param constructor");
	}

	@Bean(name="dt")
	@Scope("singleton")
	public LocalDateTime createLDT() {
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}
	
	@Bean(name="dt1")
	@Scope("singleton")
	public LocalDateTime createLDT1() {
		System.out.println("AppConfig.createLDT1()");
		return LocalDateTime.now();
	}
}
