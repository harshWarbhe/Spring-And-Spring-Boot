package com.harsh.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "org.h")
public class Employee {

	private Integer eno;
	private String name;

	private String[] favColor;

	private List<String> nickName;
	private Set<Long> PhoneNumber;
	private Map<String, Object> idDetails;
	
	//has-a property
	private Company company;
	

}
