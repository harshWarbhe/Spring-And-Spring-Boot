package com.harsh.factory;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.harsh.sbeans.DieselEngine;
import com.harsh.sbeans.ElectricEngine;
import com.harsh.sbeans.IEngine;
import com.harsh.sbeans.PetrolEngine;

@Component("eFactory")
public class EngineFactory implements FactoryBean<IEngine> {
	
	@Value("${engg.type}")
	private String type;

	@Override
	public IEngine getObject() throws Exception {
		System.out.println("EngineFactory.getObject()");
		
		switch (type) {
		case "petrol":
				return new PetrolEngine();
				
		case "diesel":
				return new DieselEngine();
				
		case "electric":
				 return new ElectricEngine();
		default:
			throw new IllegalArgumentException("Invalid Engine type");
		} 
		
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		System.out.println("EngineFactory.getObjectType()");

		return IEngine.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("EngineFactory.isSingleton()");
		return FactoryBean.super.isSingleton();
	}
}
