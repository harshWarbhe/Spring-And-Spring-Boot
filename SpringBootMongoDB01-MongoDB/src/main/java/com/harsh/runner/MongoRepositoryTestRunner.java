package com.harsh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.document.Employee;
import com.harsh.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee();
		e.setEno(1002);
		e.setEname("sanu");
		e.setSadd("warora");
		e.setSalary(990000.0);
		e.setIsVaccinated(true);
		
		System.out.println(service.saveEmployee(e));

	}

}
