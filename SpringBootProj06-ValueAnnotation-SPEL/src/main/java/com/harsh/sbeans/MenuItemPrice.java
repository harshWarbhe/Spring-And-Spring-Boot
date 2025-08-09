package com.harsh.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("menuPrice")
public class MenuItemPrice {

	@Value("${menu.dosarate}")
	private Float dosarate;
	
	@Value("${menu.idlerate}")
	private Float idlerate;
	
	@Value("${menu.bondarate}")
	private Float bondarate;
	
	@Value("${menu.poharate}")
	private Float poharate;
}
