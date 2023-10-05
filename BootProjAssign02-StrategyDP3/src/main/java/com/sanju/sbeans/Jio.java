package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements SIM {

	@Override
	public void calling() {
		System.out.println("Calling via Jio");
	}

}
