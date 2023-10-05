package com.sanju.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.Customer;
import com.sanju.repository.ICustRepository;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustService {

	@Autowired
	private ICustRepository custRepository;

	@Override
	public String registerCustomer(Customer customer) {
		System.out.println("Customer id before save: " + customer.getCid());
		Customer cust = custRepository.save(customer);
		return "Customer obj is saved with id value: " + cust.getCid();
	}

	@Override
	public String registerGroupOfCustomers(Iterable<Customer> customers) {
		if (customers != null) {
			Iterable<Customer> savedCustomers = custRepository.saveAll(customers);
			int size = ((Collection) savedCustomers).size();
			List<Integer> list = new ArrayList<>();
			savedCustomers.forEach(d -> list.add(d.getCid()));

			return size + " no. of customers are saved with id values " + list.toString();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public boolean isCustomerAvailable(Integer id) {
		boolean isAvailable = custRepository.existsById(id);
		return isAvailable;
	}

	@Override
	public long fetchCustomerCount() {
		long count = custRepository.count();
		return count;
	}

	@Override
	public Iterable<Customer> showAllCustomers() {
		return custRepository.findAll();

	}

	@Override
	public Iterable<Customer> findCustomersById(Iterable<Integer> ids) {
		return custRepository.findAllById(ids);
	}

	@Override
	public boolean findACustomerById(Integer id) {
		return custRepository.existsById(id);
	}

	@Override
	public Optional<Customer> fetchACustomerDetails(Integer id) {
		Optional<Customer> customer = custRepository.findById(id);
		if (customer.isPresent()) {
			return customer;
		} else {
			return Optional.empty();
		}
	}

	@Override
	public String updateCustomerBillAmtById(Integer id, Float newBillAmt) {
		Optional<Customer> isCustAvailable = custRepository.findById(id);
		if (isCustAvailable.isPresent()) {
			Customer customer = isCustAvailable.get();
			custRepository.save(customer);
			return "Customer ID " + id + " updated with new Bill Amount: " + newBillAmt;
		} else {
			return "Customer ID not found";
		}
	}

}