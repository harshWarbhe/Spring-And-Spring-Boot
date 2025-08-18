package com.harsh.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.entity.Actor;
import com.harsh.service.IActorMgmtService;

@Component
public class PLSQLTestRunner implements CommandLineRunner {
	@Autowired
	private IActorMgmtService  actorService;

	@Override
	public void run(String... args) throws Exception {
		try {
			List<Actor> list=actorService.showActorsByCategories("hero", "comedian", "Actress");
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
