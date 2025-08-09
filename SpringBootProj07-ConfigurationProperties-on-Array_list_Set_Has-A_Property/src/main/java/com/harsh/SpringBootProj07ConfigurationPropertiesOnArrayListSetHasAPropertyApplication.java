package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.sbeans.Employee;

@SpringBootApplication
public class SpringBootProj07ConfigurationPropertiesOnArrayListSetHasAPropertyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj07ConfigurationPropertiesOnArrayListSetHasAPropertyApplication.class, args);

		Employee employee = ctx.getBean("employee", Employee.class);
	
		System.out.println(employee);
		
	}

}
