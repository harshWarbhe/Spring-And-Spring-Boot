package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.sbeans.StudyClasses;

@SpringBootApplication
public class SpringBootProj01DependencyInjection3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj01DependencyInjection3Application.class, args);
		
		StudyClasses studyClasses = ctx.getBean("study", StudyClasses.class);
		
		studyClasses.prepare("Straded", "Ended");
		
		ctx.close();
		
	}

}
