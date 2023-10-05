package com.sanju.service;

import java.util.List;

import com.sanju.entities.Customer;

public interface ICustService {
	public String delereCustomerByIdsInBatch(List<Integer> ids);

	public Customer getCustomerById(int id);
}
