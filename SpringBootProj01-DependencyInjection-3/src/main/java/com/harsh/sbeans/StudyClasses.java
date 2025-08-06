package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("study")
public class StudyClasses {

	@Autowired
	@Qualifier("python")
	private IMaterial material;
	
	public void prepare(String start, String endString)
	{
		System.out.println(start);
		material.study();
		System.out.println(endString);
	}
}
