package com.sanju.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {

	public Mobile() {
		System.out.println("Mobile: 0-param constructor");
	}

	@Qualifier("jio")
	@Autowired
	private SIM sim;

	public void call() {
		System.out.println("Mobile.call()");
		sim.calling();
	}
}
