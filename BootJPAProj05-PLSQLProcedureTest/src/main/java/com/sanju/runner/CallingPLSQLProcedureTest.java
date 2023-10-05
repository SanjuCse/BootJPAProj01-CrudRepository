package com.sanju.runner;

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

	@Override
	public void run(String... args) throws Exception {
		List<Customer> list = service.showCustomersByBillAmount(3500f, 5500f);
		list.forEach(System.out::println);
	}
}
