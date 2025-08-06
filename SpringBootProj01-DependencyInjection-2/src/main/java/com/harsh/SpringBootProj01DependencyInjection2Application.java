package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.harsh.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/harsh/cfgs/applicationContext.xml")
public class SpringBootProj01DependencyInjection2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication
				.run(SpringBootProj01DependencyInjection2Application.class, args);

		// get access to target Spring bean class object
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);

		vehicle.journey("warora", "hyd");

		ctx.close();
	}

}
