package com.harsh.service;

import java.util.List;

import com.harsh.model.Employee;

public interface IEmployeeMgmtService {

	public List<Employee> FetchEmployeeByDesgs(String desg1,String desg2,String desg3) throws Exception;

}
