package com.harsh.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDaysFilter {

	@Autowired // field injection
	@Qualifier("Idate1")
	private LocalDate date;

	@Autowired
	private LocalTime time;

	@Autowired
	public WeekDaysFilter(@Qualifier("Idate2") LocalDate date, LocalTime time) { // constructor Injection
		super();
		System.out.println("WeekDaysFilter() :: 2 param constructor");
		this.date = date;
		this.time = time;
	}

	@Autowired
	@Qualifier("Idate3")
	public void setDate(LocalDate date) { // setter Injection
		System.out.println("WeekDaysFilter.setDate()");
		this.date = date;
	}

	@Autowired
	@Qualifier("Idate4")
	private void putDate(LocalDate date) { // arbitrary Injection
		System.out.println("WeekDaysFilter.putDate()");
		this.date = date;
	}

	private void assignTime(LocalTime time) {
		System.out.println("WeekDaysFilter.assignTime()");
		this.time = time;

	}

	@Autowired
	public void setTime(LocalTime time) {
		System.out.println("WeekDaysFilter.setTime()");
		this.time = time;
	}

	public String showMessage(String user) {
		System.out.println("WeekDaysFilter.showMessage() :: " + date + "	" + time);

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
