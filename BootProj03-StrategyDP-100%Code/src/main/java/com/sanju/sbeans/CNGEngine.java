package com.sanju.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("cngEngine")
public final class CNGEngine implements IEngine {

	public CNGEngine() {
		System.out.println("CNGEngine:: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNG Engine started");
	}

	@Override
	public void stop() {
		System.out.println("CNG Engine stopped");

	}

}
