package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public void courier() {
		System.out.println("Courier through DTDC");
	}

}
