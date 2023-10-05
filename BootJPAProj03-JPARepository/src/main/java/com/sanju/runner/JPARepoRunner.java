package com.sanju.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.service.ICustService;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class JPARepoRunner implements CommandLineRunner {

	@Autowired
	private ICustService service;

//	@Override
//	public void run(String... args) throws Exception {
//		service.delereCustomerByIdsInBatch(List.of(1, 28));
//	}

//	It will give Error bcz of List.of() method
//	@Override
//	public void run(String... args) throws Exception {
//		service.delereCustomerByIdsInBatch(List.of(1, null));
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		service.delereCustomerByIdsInBatch(Arrays.asList(30, null));
//	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Customer customer = service.getCustomerById(21);
			System.out.println(customer == null ? "Customer not found" : customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
