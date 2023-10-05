package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.Customer;
import com.sanju.repo.ICustRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("custService")
public class CustMgmtServiceImpl implements ICustMgmtService {

	@Autowired
	private ICustRepo custRepo;

	@Override
	public String registerCustomer(Customer customer) {
		Integer cid = custRepo.save(customer).getCid();
		return "Customer is saved with ID: " + cid;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}
}
