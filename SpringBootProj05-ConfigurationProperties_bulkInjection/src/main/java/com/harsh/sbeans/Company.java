package com.harsh.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component("comp")
@Data
@ToString		//optional
@ConfigurationProperties(prefix = "org.harsh")
public class Company {
	private String name;
	private String addrs;
	private Long pincode;
	private Long mobNo;

}
