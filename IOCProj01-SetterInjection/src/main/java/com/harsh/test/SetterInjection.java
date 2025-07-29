package com.harsh.test;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.harsh.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		//Hold spring beans cfg file name and location 
		//ApplicationContext res = new ClassPathXmlApplicationContext("com/harsh/cfgs/ApplicationContext.xml");  //best
		
		
		ApplicationContext res = new FileSystemXmlApplicationContext("D:\\NIT problems\\selfStudy\\Spring & Spring Boot\\IOCProj01-SetterInjection\\src\\main\\java\\com\\harsh\\cfgs\\ApplicationContext.xml");
		
		//create IOC container (bean Factory container)
		//XmlBeanFactory factory = new XmlBeanFactory(res);
		
//		//get target spring bean class object 
//		Object obj = factory.getBeans("wmg");
//		
//		//typecasting
//		WishMessageGenerator generator =(WishMessageGenerator) obj;
		
		// Get the bean
        WishMessageGenerator generator = (WishMessageGenerator) res.getBean("wmg");
		
		//invoke b.method
		String result = generator.generateMessage("harsh");
		System.out.println("wish message : "+result);
		
		
		Class<WishMessageGenerator> clazz = WishMessageGenerator.class;
		
		System.out.println("\nclass obj is holding : "+clazz.getName());
		System.out.println("\nsuper class name : "+clazz.getClass().getSuperclass());
		System.out.println("\nimplemented interface names : "+Arrays.toString(clazz.getInterfaces()));
		System.out.println("\nmethod names : "+Arrays.toString(clazz.getDeclaredMethods()));
		
		
	}
}
