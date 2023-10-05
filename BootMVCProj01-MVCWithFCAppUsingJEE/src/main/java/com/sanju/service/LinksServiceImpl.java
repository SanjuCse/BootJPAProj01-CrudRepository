package com.sanju.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LinksServiceImpl implements ILinksService {

	@Override
	public String generateWishMessages() {
		LocalDateTime dateTime = LocalDateTime.now();
		int hour = dateTime.getHour();
		if (hour < 12) {
			return "Good Morning";
		} else if (hour < 16) {
			return "Good Afternoon";
		} else if (hour < 20) {
			return "Good Evening";
		} else {
			return "Good Night";
		}
	}

	@Override
	public Set<String> fetchAllLanguages() {
//		Locale[] locales = Locale.getAvailableLocales();
//		Set<String> langs = new HashSet<>();
//		for (Locale locale : locales) {
//			langs.add(locale.getDisplayLanguage());
//		}
//--------------------------OR-----------------------------
		Set<String> langs = Arrays.asList(Locale.getAvailableLocales()).stream()
				.map(locale -> locale.getDisplayLanguage()).collect(Collectors.toSet());

		return langs;
	}

}
