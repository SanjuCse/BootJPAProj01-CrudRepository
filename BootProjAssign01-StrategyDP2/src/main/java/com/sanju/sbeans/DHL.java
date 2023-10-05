package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier {

	@Override
	public void courier() {
		System.out.println("Courier through DHL");
	}

}
