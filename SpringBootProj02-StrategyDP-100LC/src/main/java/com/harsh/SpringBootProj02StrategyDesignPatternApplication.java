package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.harsh.sbeans.Cricketer;

@SpringBootApplication
@ImportResource("com/harsh/cfgs/applicationContext.xml")
public class SpringBootProj02StrategyDesignPatternApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProj02StrategyDesignPatternApplication.class, args);
		
		Cricketer cricketer = ctx.getBean("cktr",Cricketer.class);
		
		String msg = cricketer.batting();
		System.out.println(msg);
		
		ctx.close();
		
	}

}
