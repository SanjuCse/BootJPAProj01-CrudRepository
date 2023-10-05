package com.sanju;

import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		Customer cust2 = new Customer();
		cust2.setId(12345);
		cust2.setName("sanju");
		Predicate<Customer> predicate = cust -> cust.equals(cust2);

		System.out.println(predicate.test(new Customer(12345, "sanj")));
	}
}
