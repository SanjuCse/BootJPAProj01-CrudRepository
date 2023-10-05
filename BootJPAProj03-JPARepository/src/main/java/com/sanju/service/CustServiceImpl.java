package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.sanju.entities.Customer;
import com.sanju.repository.ICustRepository;

@Component
public class CustServiceImpl implements ICustService {

	@Autowired
	private ICustRepository custRepository;

	@Override
	public String delereCustomerByIdsInBatch(List<Integer> ids) {
		List<Customer> list = custRepository.findAllById(ids);
		custRepository.deleteAllByIdInBatch(ids);
		return list.size() + " records are deleted";
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = custRepository.getReferenceById(id);
		return customer;
	}

}
