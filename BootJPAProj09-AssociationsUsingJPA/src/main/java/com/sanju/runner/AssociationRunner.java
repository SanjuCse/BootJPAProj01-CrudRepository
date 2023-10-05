package com.sanju.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.Person;
import com.sanju.entities.PhoneNumber;
import com.sanju.service.IOTMAssociationMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {
	@Autowired
	private IOTMAssociationMgmtService service;

//	 saveDataUsingParent
//	@Override
//	public void run(String... args) throws Exception {
//		Person person = new Person("kanhu", "Kaatu");
//		PhoneNumber number1 = new PhoneNumber(1111111111L, "VI");
//		PhoneNumber number2 = new PhoneNumber(2222222222L, "Airtel");
//
//		String msg = service.saveDataUsingParent(person, number1, number2);
//		System.out.println(msg);
//		System.out.println(person);
//		System.out.println(number1);
//		System.out.println(number2);
//	}

//	saveDataUsingChild
//	@Override
//	public void run(String... args) throws Exception {
//		Person person = new Person("madhab", "CTC");
//		PhoneNumber number1 = new PhoneNumber(3333333333L, "Jio");
//		PhoneNumber number2 = new PhoneNumber(4444444444L, "Voda");
//
//		String msg = service.saveDataUsingChild(person, number1, number2);
//		System.out.println(msg);
//		System.out.println(person);
//		System.out.println(number1);
//		System.out.println(number2);
//
//	}

//	loadDataUsingParent
	@Override
	public void run(String... args) throws Exception {
		List<Person> list = service.loadDataUsingParent();
//		list.forEach(System.out::println);
		list.forEach(per -> {
			Set<PhoneNumber> phoneNumbers = per.getPhoneNumbers();
			list.forEach(System.out::println);
			phoneNumbers.forEach(System.out::println);
		});
	}
}
