package com.sanju.runner;

import java.util.Arrays;
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
//		custService.searchCustomersByBillAmount(3500.0, 5500.0, 6500.0).forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		custService.searchCustomersByBillAmount(3500.0, 5500.0).forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Customer> address = custService.searchCustomersByAddress("Berhampur", "Nirakarapur");
//		address.forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		custService.showCustomersDataByBillAmt(3500f, 5500f).forEach(row -> {
//			System.out.println(Arrays.toString(row));
//		});
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		custService.searchAllCustomersByCustID(02, 05).forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Optional<Customer> optional = custService.showCustomerInfoByName("sanju");
//		System.out.println(optional.isPresent() ? optional : "No Data dfound for this Customer name");
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Object object = custService.showCustomerDataByName("Raghu");
//		Object[] objects = (Object[]) object;
//		System.out.println(Arrays.toString(objects));
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String string = custService.showAddressByName("Raghu");
//		System.out.println(string);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		int count = custService.fetchCustomersNameCount();
//		System.out.println("Total doctor is " + count);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Object aggregateData = custService.fetchAggregateData();
//		Object[] aggregateDatas = (Object[]) aggregateData;
//		// System.out.println(Arrays.toString(aggregateDatas));
//		// count(*), max(billAmt), min(billAmt), avg(billAmt), sum(billAmt)
//		System.out.println("Total record count is " + aggregateDatas[0]);
//		System.out.println("Max of bill amount " + aggregateDatas[1]);
//		System.out.println("Min of bill amount " + aggregateDatas[2]);
//		System.out.println("Average of bill amount " + aggregateDatas[3]);
//		System.out.println("Sum of bill amount " + aggregateDatas[4]);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		int count = custService.discountOfTwoHundredForEachCustomer();
//		System.out.println("Afftected Records " + count);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		int count = custService.revomeCustomersByRange(7000.0, 7500.0);
//		System.out.println(count + " number of customers removed from database");
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		int count = custService.registerCustomer(5500, "Balasore", "Bikram");
//		System.out.println(count > 0 ? count + " number of Customer(s) Registered Sucessfully" : "Unable to Register");
//
//		int incrementedCountValue = custService.updateSeqValue();
//		if (incrementedCountValue > 0) {
//			System.out.println("Increment Done " + incrementedCountValue);
//		} else {
//			System.out.println("Sequence Value is not incremented");
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String systemDate = custService.showSystemDate();
//		System.out.println("Current System Date and time is " + systemDate);
//	}

	@Override
	public void run(String... args) throws Exception {
		String createTable = custService.createTable();
		System.out.println(createTable);
	}
}
