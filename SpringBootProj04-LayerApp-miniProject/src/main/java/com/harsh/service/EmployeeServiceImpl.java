package com.harsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.dao.IEmployeeDAO;
import com.harsh.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<Employee> FetchEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list = dao.getEmployeeByDesgs(desg1, desg2, desg3);
		
		return list;
		
	}

}
