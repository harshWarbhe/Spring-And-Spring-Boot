package com.harsh.sbeans;

import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourseMaterial implements IMaterial {

	@Override
	public void study() {
		System.out.println("\nPythonCourseMaterial.study()");
		System.out.println("Reading Python study material");


	}

}
