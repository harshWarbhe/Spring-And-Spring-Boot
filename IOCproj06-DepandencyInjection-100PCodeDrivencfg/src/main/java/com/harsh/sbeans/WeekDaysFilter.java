package com.harsh.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDaysFilter {

	@Autowired // field injection
	private LocalDate date;

	public WeekDaysFilter() {
		System.out.println("WeekDaysFilter() :: 0 param constructor");
	}

	public String showMessage(String user) {
		System.out.println("WeekDaysFilter.showMessage() :: " + date);

		// get current week day number
		int wNumber = date.getDayOfWeek().getValue();

		// generate message
		if (wNumber >= 1 && wNumber <= 5) {
			return "WORK........" + user;
		} else {
			return "RELAX........" + user;
		}
	}

}
