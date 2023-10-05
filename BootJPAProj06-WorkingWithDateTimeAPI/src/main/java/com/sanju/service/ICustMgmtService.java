package com.sanju.service;

import java.util.List;

import com.sanju.entities.Customer;

public interface ICustMgmtService {
	public String registerCustomer(Customer customer);

	public List<Customer> getAllCustomers();
}
