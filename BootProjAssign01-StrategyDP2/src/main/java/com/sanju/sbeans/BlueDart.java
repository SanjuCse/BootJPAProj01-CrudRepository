package com.sanju.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {

	@Override
	public void courier() {
		System.out.println("Courier through BlueDart");
	}

}
