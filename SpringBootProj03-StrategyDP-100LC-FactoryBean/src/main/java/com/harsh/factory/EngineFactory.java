package com.harsh.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.harsh.sbeans.DieselEngine;
import com.harsh.sbeans.ElectricEngine;
import com.harsh.sbeans.IEngine;
import com.harsh.sbeans.PetrolEngine;

@Component
public class EngineFactory implements FactoryBean<IEngine> {
	
	@Value("${Engine.id}")
	private String enggId;

	@Override
	public IEngine getObject() throws Exception {
		if (enggId.equalsIgnoreCase("pEngine")) {
			return new PetrolEngine();
		}
		else if (enggId.equalsIgnoreCase("dEngine")) {
			return new DieselEngine();
		}
		else if (enggId.equalsIgnoreCase("eEngine")) {
			return new ElectricEngine();
		}
		else {
			throw new IllegalArgumentException("Invalid ID");
		}
	}

	@Override
	public Class<?> getObjectType() {
		return IEngine.class;
	}

	@Override
	public boolean isSingleton() {
//		return FactoryBean.super.isSingleton();
		return true;
	}
}
