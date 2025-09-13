package com.harsh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.model.Customer;

@RestController
public class CustomerOpeeratorController {

	@GetMapping("/report")
	public ResponseEntity<Customer> showData() {

		Customer customer = new Customer(1001, "harsh", "warora", 599.00F);
		

		return new ResponseEntity<>(customer, HttpStatus.OK);
		 // OR simpler:
        // return ResponseEntity.ok(customer);
	}
}
