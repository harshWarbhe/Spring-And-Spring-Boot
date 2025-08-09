package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.sbeans.Hotel;

@SpringBootApplication
public class SpringBootProj06ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProj06ValueAnnotationSpelApplication.class, args);

		Hotel hotel = context.getBean("hotel", Hotel.class);
		
		System.out.println(hotel);
		
		context.close();
	
	}

}
