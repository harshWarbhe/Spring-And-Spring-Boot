package com.harsh.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "cust.info")
@Data
public class Company {

	private Integer id;
	private String name;
	private String addrs;
	private Integer size;
}
