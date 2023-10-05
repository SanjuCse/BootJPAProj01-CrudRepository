package com.sanju;

import java.util.function.Predicate;

import lombok.Data;

public class PredicateTest implements Predicate<String> {
	public static void main(String[] args) {
		Predicate<String> predicate = (str) -> str.isEmpty();
		Predicate<Customer> predicate2 = (customer) -> customer.isCustomerFromBerhmapur();

		boolean isEmpty = new PredicateTest().test(" ");
		boolean isfromBam = predicate2.test(new Customer());
		System.out.println(" is my string empty? " + isEmpty);
		System.out.println(" is Customer from Berhampur? " + isfromBam);
	}

	@Override
	public boolean test(String string) {
		return string.isEmpty();
	}
}
