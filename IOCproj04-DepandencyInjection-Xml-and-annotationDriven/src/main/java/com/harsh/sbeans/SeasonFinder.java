package com.harsh.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	private LocalDate date;	//has-a priperty composition

	public SeasonFinder() {
		System.out.println("SeasonFinder :: 0 param constructor");
	}

	// setter method for setter injection
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}

	// b.logic
	public String showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()");
		int month = date.getMonthValue();
		if (month >= 3 && month <= 6) {
			return "SUMMER SEASON ";
		} else if (month >= 7 && month <= 10) {
			return "RAINY SEASON ";
		} else {
			return "WINTER SEASON ";
		}

	}

}
