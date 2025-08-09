package com.harsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.harsh.model.Employee;
import com.harsh.service.IEmployeeMgmtService;

@Controller("payroll")
public class EmployeeOperationsController {

	@Autowired
	private IEmployeeMgmtService service;

	public List<Employee> showAllEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {

		List<Employee> list = service.FetchEmployeeByDesgs(desg1, desg2, desg3);

		return list;

	}

}
