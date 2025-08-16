package com.harsh.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.entity.Politician;
import com.harsh.service.IPoliticianMgmtService;

@Component
public class DateTimeTestRunner implements CommandLineRunner {
	@Autowired
	private  IPoliticianMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Politician  politician=new Politician("harsh",true,"warora");
			politician.setDob(LocalDate.of(2002, 05, 18));
			politician.setTob(LocalTime.of(10, 20, 10));  politician.setDoj(LocalDateTime.of(2025,10,21,10,10,34));
			String msg=service.registerPolitician(politician);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("==================================");
		
		try {
			Politician politician=service.showPoliticianById(1001);
			System.out.println(politician);
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		System.out.println("================");
		try {
			service.showAllPoliticians().forEach(System.out::println);;
			
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		
		System.out.println("Press any key  to end the app");
		System.in.read();

	}

}
