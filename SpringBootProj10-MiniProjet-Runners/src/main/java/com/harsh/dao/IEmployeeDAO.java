package com.harsh.dao;

import java.util.List;

import com.harsh.model.Employee;

public interface IEmployeeDAO {

	public List<Employee> showEmployessByDesgs(String desg1, String desg2, String desg3) throws Exception;

	public int insert(Employee emp) throws Exception;

}
