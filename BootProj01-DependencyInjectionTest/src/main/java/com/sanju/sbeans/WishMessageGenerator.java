package com.sanju.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator: 0-param constructor");
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = dateTime.getHour();

		if (hour < 12) {
			return "Good Morning:" + user;
		} else if (hour < 16) {
			return "Good Afternoon:" + user;
		} else if (hour < 20) {
			return "Good Evening:" + user;
		}else {
			return "Good Night:" + user;			
		}
	}

}
