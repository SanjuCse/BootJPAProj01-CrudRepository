package com.sanju.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myntra")
public class Myntra {
	public Myntra() {
		System.out.println("Myntra:: 0-param constructor ");
	}

	@Qualifier("bDart")
	@Autowired
	private Courier courier;

	public void deliver() {
		System.out.println("Myntra.deliver()");
		courier.courier();
	}
}
