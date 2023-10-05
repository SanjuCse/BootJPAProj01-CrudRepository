package com.sanju;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sanju.sbeans.WishMessageGenerator;

@SpringBootApplication
public class DependencyTest {

	@Bean
	public LocalDateTime createLDT() {
		System.out.println("DependencyTest.createLDT()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyTest.class, args);
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
		String message = wmg.generateWishMessage("sanju");
		System.out.println(message);
	}

}
