package com.harsh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	public Integer cno;
	public String cname;
	public String addrs;
	public Float billAmt;
}
