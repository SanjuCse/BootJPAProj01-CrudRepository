package com.sanju.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.service.ICustService;

@Component
public class PandSRepoRunner implements CommandLineRunner {

	@Autowired
	private ICustService service;

//	@Override
//	public void run(String... args) throws Exception {
//		service.showCustomersBySorting(true, "cname").forEach(System.out::println);
//		System.out.println("---------------------------------------");
//		service.showCustomersBySorting(false, "billAmt").forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		try {
//			Page<Customer> page = service.showCustomersByPageNo(1, 3, true, "cname");
//			System.out.println("page number:: " + page.getNumber());
//			System.out.println("page number of Elements:: " + page.getNumberOfElements());
//			System.out.println("page size:: " + page.getSize());
//			System.out.println("page Total Elements:: " + page.getTotalElements());
//			System.out.println("page Total Pages:: " + page.getTotalPages());
//			System.out.println("is it First Page:: " + page.isFirst());
//			System.out.println("is it Last Page:: " + page.isLast());
//			System.out.println("is it Empty Page:: " + page.isEmpty());
//
//			if (!page.isEmpty()) {
//				List<Customer> content = page.getContent();
//				content.forEach(System.out::println);
//			} else {
//				System.out.println("No page found");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void run(String... args) throws Exception {
		service.showCustomersPageByPage(3);
	}

}
