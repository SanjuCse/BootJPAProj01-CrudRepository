package com.sanju.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.service.ICustMgmtService;

@Component
public class CallingPLSQLProcedureTest implements CommandLineRunner {

	@Autowired
	private ICustMgmtService service;

//	@Override
//	public void run(String... args) throws Exception {
//		Customer customer = new Customer("sanju", "Ganjam", 12345f, LocalDateTime.now(), LocalTime.now(),
//				LocalDate.now());
//		String msg = service.registerCustomer(customer);
//		System.out.println(msg);
//	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> customers = service.getAllCustomers();
		customers.forEach(System.out::println);

	}

}