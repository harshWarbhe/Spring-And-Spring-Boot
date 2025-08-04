package com.harsh.sbeans;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine::  Petrol Engine is started");
		
	}

	@Override
	public void stopEngine() {
	   System.out.println("PetrolEngine:: Petrol Engine is stopped)");	
	}

}
