package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements SIM {

	@Override
	public void calling() {
		System.out.println("Calling via Airtel");
	}

}
