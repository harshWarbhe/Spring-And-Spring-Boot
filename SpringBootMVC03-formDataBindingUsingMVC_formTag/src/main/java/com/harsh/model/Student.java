package com.harsh.model;

import lombok.Data;

@Data
public class Student {

	private Integer sno;
	private String sname;
	private String saddrs = "hyd";
	private Float avg;

}
