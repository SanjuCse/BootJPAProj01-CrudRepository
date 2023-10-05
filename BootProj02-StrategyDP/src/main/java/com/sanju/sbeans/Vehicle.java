package com.sanju.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;

	public void journey(String startingPoint, String endingPoint) {
		System.out.println("Journey Planned");
		engine.start();
		System.out.println("Journey started from- " + startingPoint);
		engine.stop();
		System.out.println("Journey ended at- " + endingPoint);
	}
}
