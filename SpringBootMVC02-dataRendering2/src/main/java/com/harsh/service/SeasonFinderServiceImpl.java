package com.harsh.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService{

	@Override
	public String findSeason() {
		LocalDate localDate = LocalDate.now();
		
		int month = localDate.getMonthValue();
		
		if (month<=7 && month >=10) {
			return "rainy season";
		}
		else if (month<=11 && month >=2) {
			return "winter season";
		}
		else {
			return "summer season";
		}

	}

}
