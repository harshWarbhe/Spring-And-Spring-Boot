package com.harsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.document.Employee;
import com.harsh.repository.IEmployeeRepo;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo employeeRepo;

	@Override
	public String saveEmployee(Employee e) {

		return "MongoDB Doc is saved with id value : " + employeeRepo.save(e).getId();
	}

}
