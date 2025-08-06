package com.harsh;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.harsh.sbeans.SeasonFinder;

@SpringBootApplication

/*
 * @Configuration / @SpringBootConfiguration
 * 
 * @AutoConfiguration
 * 
 * @ComponentScan
 */
public class BootIocProj01DependencyInjectionApplication {

	/*
	 * note :: In spring boot Apps, we do not take separate Configuration classes
	 * because main class having @SpringBootApplication itself act as Configuration
	 * class
	 */
	
	
	@Bean(name = "id")
	public LocalDate createDate() {
		return LocalDate.now();

	}

	public static void main(String[] args) {

		//get ioc container
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj01DependencyInjectionApplication.class);
		
		//get target spring bean class obj  ref
		SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);
		
		String result = finder.findSeason();
		System.out.println(result);

		System.out.println("----------------------------------------------------------------");
		
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		System.out.println("beans id are : "+Arrays.toString(beanDefinitionNames));
		
		ctx.close();
	}

}


