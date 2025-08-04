package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	private IEngine engine;
	
	public void journey(String startPlace, String destPlace) {
		System.out.println("Journey started from ::"+startPlace);
		engine.startEngine();
		
		System.out.println("-----Journey  is  going on--from "+startPlace+"  to "+destPlace+"------------");
		
		System.out.println("Jounery  stopped  at ::"+destPlace);
		engine.stopEngine();

	}
}
