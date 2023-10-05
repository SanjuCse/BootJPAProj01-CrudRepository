package com.sanju.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("/seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService {

	private LocalDateTime ldt = LocalDateTime.now();

	@Override
	public String findSeason() {
		int month = ldt.getMonthValue();
		System.out.println("month in number is : " + month);
		if (month >= 7 && month <= 9) {
			return "Rainy Season";
		} else if (month >= 3 && month <= 6) {
			return "Summer Season";
		} else {
			return "Winter Season";
		}
	}
}
