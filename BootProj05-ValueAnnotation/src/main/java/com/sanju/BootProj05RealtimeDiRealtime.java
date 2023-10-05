package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Hotel;

@SpringBootApplication
public class BootProj05RealtimeDiRealtime {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj05RealtimeDiRealtime.class, args);
		Hotel hotel = context.getBean("hotel", Hotel.class);
//		String msg = hotel.msg();
//		System.out.println(msg);
		System.out.println(hotel);
		context.close();
	}
}
