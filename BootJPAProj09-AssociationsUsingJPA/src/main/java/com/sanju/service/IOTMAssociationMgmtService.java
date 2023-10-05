package com.sanju.service;

import java.util.List;

import com.sanju.entities.Person;
import com.sanju.entities.PhoneNumber;

public interface IOTMAssociationMgmtService {
	String saveDataUsingParent(Person person, PhoneNumber number1, PhoneNumber number2);

	String saveDataUsingChild(Person person, PhoneNumber number1, PhoneNumber number2);

	List<Person> loadDataUsingParent();
}