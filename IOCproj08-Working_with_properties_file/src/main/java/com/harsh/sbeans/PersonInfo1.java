package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pInfo1")
public class PersonInfo1 {

	@Autowired
	private Environment envi;
	
	public void showData() {
		System.out.println("os.name"+envi.getProperty("os.name"));
		System.out.println("per.id key value : "+envi.getProperty("per.id"));

	}
}
