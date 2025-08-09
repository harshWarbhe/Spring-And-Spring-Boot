package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.sbeans.Company;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootProj05ConfigurationPropertiesBulkInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj05ConfigurationPropertiesBulkInjectionApplication.class, args);
		
		Company company = ctx.getBean("comp", Company.class);
		
		System.out.println(company);
		
		ctx.close();
		
	}

}
