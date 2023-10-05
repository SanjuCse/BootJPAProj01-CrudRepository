package com.sanju.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.Person;
import com.sanju.entities.PhoneNumber;
import com.sanju.repo.IPersonRepo;
import com.sanju.repo.IphoneNumberRepo;

import jakarta.transaction.Transactional;

@Service
public class OTMAssociationServiceImpl implements IOTMAssociationMgmtService {
	@Autowired
	private IPersonRepo personRepo;

	@Autowired
	private IphoneNumberRepo numberRepo;

	@Override
	public String saveDataUsingParent(Person person, PhoneNumber number1, PhoneNumber number2) {
		number1.setPerson(person);
		number2.setPerson(person);
		Set<PhoneNumber> numbers = new HashSet<>();
		numbers.add(number1);
		numbers.add(number2);
		person.setPhoneNumbers(numbers);
		Person person2 = personRepo.save(person);
		return "Person details has been registered with Person ID- " + person2.getPid();
	}

	@Override
	public String saveDataUsingChild(Person person, PhoneNumber number1, PhoneNumber number2) {
		number1.setPerson(person);
		number2.setPerson(person);

		Set<PhoneNumber> phoneNumbers = new HashSet<>();
		phoneNumbers.add(number1);
		phoneNumbers.add(number2);
		person.setPhoneNumbers(phoneNumbers);

		numberRepo.save(number1);
		numberRepo.save(number2);

//		Iterator<PhoneNumber> iterator = phoneNumbers.iterator();
//		while (iterator.hasNext()) {
//			PhoneNumber phoneNumber = (PhoneNumber) iterator.next();
//
//		}
		return "Person and his associated phone numbers are saved with IDs: " + Arrays.toString(phoneNumbers.toArray());

	}

	@Override
	public List<Person> loadDataUsingParent() {
		return personRepo.findAll();
	}
}