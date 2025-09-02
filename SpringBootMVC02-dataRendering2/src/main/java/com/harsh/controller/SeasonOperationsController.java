package com.harsh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harsh.service.ISeasonFinderService;

@Controller
public class SeasonOperationsController {

	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	@RequestMapping("/season")
	private String showSeason(Map<String, Object> map) {
		String season = service.findSeason();
		
		map.put("s", season);
		
		return "display";
	}
	
}
