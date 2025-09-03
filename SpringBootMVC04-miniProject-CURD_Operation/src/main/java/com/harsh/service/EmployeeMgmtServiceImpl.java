package com.harsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.model.Employee;
import com.harsh.repo.IEmployeeRepository;

@Service("service")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public Iterable<Employee> getAllEmployee() {

		return empRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {

		return "employeed is save with empno : " + empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int eno) {
		Employee emp = empRepo.findById(eno).orElseThrow(() -> new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is updated with id value :"+empRepo.save(emp).getEmpno();
	}

	@Override
	public String deleteEmployeeByNo(int eno) {
		
		empRepo.deleteById(eno);
		
		return "Employee is deleted with id value :"+eno;
	}

}
