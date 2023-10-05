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
//		ICustService custService = context.getBean("custService", ICustService.class);
//		try {
//			Customer customer = new Customer("sanju", "BamPur", 7500f);
//			String registerCustomerMsg = custService.registerCustomer(customer);
//			System.out.println(registerCustomerMsg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		context.close();
	}
}
