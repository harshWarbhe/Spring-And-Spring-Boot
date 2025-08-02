package com.harsh.sbeans;

import org.springframework.stereotype.Component;

@Component("prn1")
public class Printer {

	private static Printer INSTANCE;

	private Printer() {
		super();
		System.out.println("Printer :: 0 param constructor");
	}
	
	//static factory method having singleton logic
	public static Printer getInstance(String msg) {
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
