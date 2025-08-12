package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.harsh.entity.Doctor;
import com.harsh.service.DoctorMngtServiceImpl;

@SpringBootApplication
public class BootJpa01CrudRepositoryApplication {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootJpa01CrudRepositoryApplication.class, args);

		DoctorMngtServiceImpl service = ctx.getBean("doctorService", DoctorMngtServiceImpl.class);

		Doctor doctor = new Doctor();

		doctor.setDocName("atharva");
		doctor.setSpecialization("ortho");
		doctor.setIncome(100000.99);

		String result = service.registerDoctor(doctor);
		
		System.out.println(result);
		
		long showDoctorCount = service.showDoctorCount();
		
		System.out.println(showDoctorCount);
	}

}
