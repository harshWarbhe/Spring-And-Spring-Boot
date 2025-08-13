package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJPA02SortingAndPagingRepository {
 
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootJPA02SortingAndPagingRepository.class, args);
		/*
		 * ConfigurableApplicationContext ctx =
		 * SpringApplication.run(BootJpa01CrudRepositoryApplication.class, args);
		 * 
		 * DoctorMngtServiceImpl service = ctx.getBean("doctorService",
		 * DoctorMngtServiceImpl.class);
		 * 
		 * Doctor doctor = new Doctor();
		 * 
		 * doctor.setDocName("atharva"); doctor.setSpecialization("ortho");
		 * doctor.setIncome(100000.99);
		 * 
		 * String result = service.registerDoctor(doctor);
		 * 
		 * System.out.println(result);
		 * 
		 * long showDoctorCount = service.showDoctorCount();
		 * 
		 * System.out.println(showDoctorCount);
		 */
	}

}
