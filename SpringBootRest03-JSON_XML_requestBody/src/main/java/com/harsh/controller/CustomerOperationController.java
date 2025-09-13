package com.harsh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.model.Customer;

@RestController
public class CustomerOperationController {

	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust) {
		return cust.toString();
	}
	
	//or
	
	@GetMapping("/getdata")
	public ResponseEntity<Customer> showData() {	
		Customer cust = new Customer(1001, "dogla pratham", "dharashiv", 50.0f);
		return new ResponseEntity<>(cust , HttpStatus.OK);
		
	}
}
