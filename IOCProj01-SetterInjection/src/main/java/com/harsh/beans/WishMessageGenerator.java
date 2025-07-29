package com.harsh.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0 param constructor");
	}

	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");

		// get current hour of the day
		int hour = date.getHours();

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

	public void setDate(Date date) {
		this.date = date;
	}

}
