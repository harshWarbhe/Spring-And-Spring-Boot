package com.harsh.sbeans;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/harsh/commons/Info.properties")
public class CheckVoterEligibilty {

	@Value("${voter.id}")
	private Integer id;

	@Value("${voter.name}")
	private String name;

	@Value("${voter.age}")
	private Integer age;

	private Date verfirdOn;

	public CheckVoterEligibilty() {
		super();
		System.out.println("CheckVoterEligibilty :: 0 param constructor)");
	}

	@PostConstruct
	public void myInti() {
		System.out.println("CheckVoterEligibilty.myInti()");

		// initialize left over proepreties that are not participates in injection
		verfirdOn = new Date(0);

		if (name == null && age < 0) {
			throw new IllegalArgumentException("set correct name and age");
		}
	}

	// b.logic
	public String checkEligibilty() {

		System.out.println("CheckVoterEligibilty.checkEligibilty()");

		if (age < 18) {
			return "not eligible for voting";
		} else {
			return " eligible for voting";
		}

	}
	
	@PreDestroy
	private void myDestroy() {
		System.out.println("CheckVoterEligibilty.myDestroy()");

		id = 0;
		name = null;
		age = 0;
		verfirdOn = null;
	}

}
