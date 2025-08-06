package com.harsh.sbeans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements IMaterial {

	@Override
	public void study() {
		System.out.println("\nJavaCourseMaterial.study()");
		System.out.println("Reading java study material");
	}

}
