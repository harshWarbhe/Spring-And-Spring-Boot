package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.sbeans.Vehicle;

@SpringBootApplication
public class SpringBootProj03StrategyDp100LcFactoryBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(SpringBootProj03StrategyDp100LcFactoryBeanApplication.class, args);

		// get access to target Spring bean class object
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);

		vehicle.journey("warora", "hyd");

		ctx.close();

	}

}
