package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Value("${engine.id}") // injecting the dependent spring bean id to spring properties
	private String id;
	
	@Autowired
	@Qualifier("eEngine")
	//@Qualifier(id)		//variable cannot pass to @qualifier annotation
	
	
	//@Qualifier("motor")	
	private IEngine engine;

	public Vehicle() {
		super();
		System.out.println("Vehicle :: 0-param constructor");
	}

	public void journey(String startPlace, String destPlace) {
		System.out.println("Journey started from ::" + startPlace);
		engine.startEngine();

		System.out.println("-----Journey  is  going on--from " + startPlace + "  to " + destPlace + "------------");

		System.out.println("Jounery  stopped  at ::" + destPlace);
		engine.stopEngine();

	}

}
