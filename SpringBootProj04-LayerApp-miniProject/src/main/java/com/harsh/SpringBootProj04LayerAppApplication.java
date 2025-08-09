package com.harsh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.controller.EmployeeOperationsController;
import com.harsh.model.Employee;

@SpringBootApplication
public class SpringBootProj04LayerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj04LayerAppApplication.class, args);
		
		EmployeeOperationsController controller = ctx.getBean("payroll",EmployeeOperationsController.class);
		
		try {
			List<Employee> list = controller.showAllEmployeeByDesgs("CLERK", "MANAGER", "SALESMAN");
			
			//PROCESS THE RESULT 
			list.forEach(emp->{System.out.println(emp);});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
		
	}

}
