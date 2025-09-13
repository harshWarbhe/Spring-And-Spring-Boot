package com.harsh.model;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlRootElement(name = "customer")
//@JacksonXmlRootElement(localName = "customer")
public class Customer {
	private Integer cno;
	private String cname;
	private String addrs;
	private Float billAmt;


}
