package com.harsh.ston;


public class Printer {

	private static Printer INSTANCE;

	private Printer() {
		super();
		System.out.println("Printer :: 0 param constructor");
	}
	
	//static factory method having singleton logic
	public static Printer getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		
		return INSTANCE;
	}
	
	//b.logic
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
