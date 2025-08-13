package com.harsh.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.entity.JobSeeker;
import com.harsh.repository.IJobSeekerRepository;

@Component
public class FinderMethodTestRunner implements CommandLineRunner {


	@Autowired
	private IJobSeekerRepository jsRepo;


	@Override
	public void run(String... args) throws Exception {

		List<JobSeeker> list = jsRepo.findByJsNameEquals("harsh");
		list.forEach(System.out::println);

		System.err.println("\n");
		jsRepo.getByJsName("harsh").forEach(System.out::println);
		System.err.println("\n");
		jsRepo.readByJsNameIs("sanu").forEach(System.out::println);
		System.err.println("\n");
		jsRepo.findByJsNameContainingIgnoreCase("a").forEach(System.out::println);
		System.err.println("\n");
		jsRepo.findByJsNameStartingWith("h").forEach(System.out::println);
	}

}
