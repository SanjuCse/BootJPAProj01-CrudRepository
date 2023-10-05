package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sanju.sbeans.Vehicle;

@ImportResource("com/sanju/cfgs/applicationContext.xml")
@SpringBootApplication
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(BootProj02StrategyDpApplication.class,
				args);) {
			Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
			String startingPoint = "Hyderabad";
			String endingPoint = "Delhi";
			vehicle.journey(startingPoint, endingPoint);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
