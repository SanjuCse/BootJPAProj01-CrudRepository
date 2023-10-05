package com.sanju.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("dEngine")
public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine:: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("Diesel Engine started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine stopped");
	}
}
