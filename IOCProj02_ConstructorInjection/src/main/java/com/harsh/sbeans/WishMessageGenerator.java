package com.harsh.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	private int age;


	public WishMessageGenerator(LocalTime time, int age) {
		System.out.println("WishMessageGenerator:: 2 param constructor");
		this.time = time;
		this.age = age;
	}


	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");

		// get current hour of the day
		int hour = time.getHour();

		// generate wish message
		if (hour < 12) {
			return "GOOD MORNING! " + user;
		} else if (hour < 16) {
			return "GOOD AFTERNOON! " + user;
		} else if (hour < 20) {
			return "GOOD EVENING! " + user;
		} else {
			return "GOOD NIGHT! " + user;
		}
	}
	
}
