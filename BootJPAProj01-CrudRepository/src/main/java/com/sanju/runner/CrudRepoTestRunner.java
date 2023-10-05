package com.sanju.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.service.ICustService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICustService custService;

//	@Override
//	public void run(String... args) throws Exception {
//		try {
//			Customer customer = new Customer();
//			customer.setCname("rama");
//			customer.setCaddr("KIT");
//			customer.setBillAmt(1500f);
//
//			String msg = custService.registerCustomer(customer);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Customer customer = new Customer();
			customer.setCname("rama");
			customer.setCaddr("nirakarapur");
			customer.setBillAmt(4500f);

			Customer customer2 = new Customer();
			customer2.setCname("laxmi");
			customer2.setCaddr("Bushandpur");
			customer2.setBillAmt(5500f);

			Customer customer3 = new Customer();
			customer3.setCname("rachana");
			customer3.setCaddr("Khordha");
			customer3.setBillAmt(3500f);

//			String msg = custService.registerGroupOfCustomers(Arrays.asList(customer, customer2, customer3));
//									(OR)
			String msg = custService.registerGroupOfCustomers(List.of(customer, customer2, customer3));
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public void run(String... args) throws Exception {
//		boolean isAvailable = custService.isCustomerAvailable(23);
//		if (isAvailable) {
//			System.out.println("Customer is available in db");
//		} else {
//			System.out.println("Customer is available inn't  db");
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		long totalCustomerCount = custService.fetchDoctorCount();
//		System.out.println("Total Customer in db table is: " + totalCustomerCount);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Iterable<Customer> customers = custService.showAllCustomers();
//		customers.forEach(cust -> System.out.println(cust));
//					OR
//		customers.forEach(cust -> {
//			System.out.println(cust);
//		});
//					OR
//		customers.forEach(System.out::println);
//					OR
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		try {
//			custService.findCustomersById(List.of(1, 20, 21, 22, 24)).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		boolean isCustExist = custService.findACustomerById(21);
//		String msg = isCustExist ? "Yes, Customer Exist." : "No, Customer doesn't Exist!";
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Optional<Customer> customerDetails = custService.fetchACustomerDetails(2);
//		if (customerDetails.isPresent()) {
//			System.out.println(customerDetails.get());
//		} else {
//			System.out.println("Customer Object not found");
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = custService.updateCustomerBillAmtById(21, 3500f);
//		System.out.println(custService.fetchACustomerDetails(1));
//		System.out.println(msg);
//		System.out.println(custService.fetchACustomerDetails(1));
//	}

}
