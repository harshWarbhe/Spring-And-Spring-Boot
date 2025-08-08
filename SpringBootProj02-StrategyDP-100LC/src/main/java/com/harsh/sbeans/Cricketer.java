package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer {

	@Autowired
	@Qualifier("bat")
	private ICricketBat bat;

	public Cricketer() {
		super();
		System.out.println("Cricketer :: 0 param constructor");
	}
	
	public String batting()
	{
		System.out.println("Cricketer.batting()");
		
		int runs = bat.scoreRun();
		return "Cricketer has scored "+runs+" run/s.";
	}
	
	
	
}
