package com.sanju.service;

import java.util.Optional;

import com.sanju.entities.Customer;

public interface ICustService {
	public String registerCustomer(Customer customer);

	public String registerGroupOfCustomers(Iterable<Customer> customers);

	public boolean isCustomerAvailable(Integer id);

	public long fetchCustomerCount();

	public Iterable<Customer> showAllCustomers();

	public Iterable<Customer> findCustomersById(Iterable<Integer> ids);

	public boolean findACustomerById(Integer id);

	public Optional<Customer> fetchACustomerDetails(Integer id);

	public String updateCustomerBillAmtById(Integer id, Float newBillAmt);
}
