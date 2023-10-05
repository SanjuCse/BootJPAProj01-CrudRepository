package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("docomo")
public class DOCOMO implements SIM {

	@Override
	public void calling() {
		System.out.println("Calling via DOCOMO");
	}

}
