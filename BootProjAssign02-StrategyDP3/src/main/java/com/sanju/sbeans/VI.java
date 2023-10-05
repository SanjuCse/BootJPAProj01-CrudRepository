package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("vi")
public class VI implements SIM {

	@Override
	public void calling() {
		System.out.println("Calling via VI");		
	}

}
