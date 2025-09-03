package com.harsh.service;

import com.harsh.model.Employee;

public interface IEmployeeMgmtService {

	public Iterable<Employee> getAllEmployee();
	
	public String registerEmployee(Employee emp);
	
	public Employee getEmployeeByNo(int eno);
	
	public String updateEmployee(Employee emp);
	
	public String deleteEmployeeByNo(int eno);
}
