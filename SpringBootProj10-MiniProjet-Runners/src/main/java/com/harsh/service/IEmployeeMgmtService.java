//Service Interface
package com.harsh.service;

import java.util.List;

import com.harsh.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception;

	public String registerEmployee(Employee emp) throws Exception;
}
