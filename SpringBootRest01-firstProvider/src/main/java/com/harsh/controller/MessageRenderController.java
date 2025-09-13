package com.harsh.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")
public class MessageRenderController {

	@GetMapping("/wish")
	private ResponseEntity<String> showMessage() {
		
		//get local date 
		LocalDateTime ldt = LocalDateTime.now();
		
		//	generate msg
		String msg ;
		
		int hours = ldt.getHour();
		if (hours<12) {
			msg = "Good Morning";
		}
		else if (hours<16) {
			msg = "Good Afternoon";
		} 
		else if (hours<20) {
			msg = "Good Evening";
		} 
		else {
			msg= "Good night";
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>(msg, HttpStatus.OK);
		
		return entity;
		

	}
}
