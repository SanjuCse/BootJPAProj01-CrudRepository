package com.sanju.service;

import org.springframework.data.domain.Page;

import com.sanju.entities.Customer;

public interface ICustService {
	public Iterable<Customer> showCustomersBySorting(boolean asc, String... props);

	public Page<Customer> showCustomersByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);

	public void showCustomersPageByPage(int pageSize);
}
