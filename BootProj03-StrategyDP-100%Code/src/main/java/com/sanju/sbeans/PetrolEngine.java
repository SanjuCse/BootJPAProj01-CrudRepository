package com.sanju.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("pEngine")
public final class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("Petrol Engine started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stopped");

	}

}
