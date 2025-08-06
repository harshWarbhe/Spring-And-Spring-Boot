package com.harsh.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("EletricEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("EletricEngine::  Eletric Engine is started");
		
	}

	@Override
	public void stopEngine() {
	   System.out.println("EletricEngine:: Eletric Engine is stopped)");	
	}

}
