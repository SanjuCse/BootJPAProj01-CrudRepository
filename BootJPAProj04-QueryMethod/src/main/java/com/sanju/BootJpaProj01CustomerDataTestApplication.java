package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.entities.Customer;
import com.sanju.service.ICustService;

@SpringBootApplication
public class BootJpaProj01CustomerDataTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootJpaProj01CustomerDataTestApplication.class, args);
	}
}