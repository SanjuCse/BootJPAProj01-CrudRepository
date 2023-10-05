package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class CustMgmtServiceImpl implements ICustMgmtService {

	@Autowired
	public EntityManager entityManager;

	@Override
	public List<Customer> showCustomersByBillAmount(Float fromBillAmt, Float toBillAmt) {
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("P_GET_CUSTOMERS_BY_BILL_AMT",
				Customer.class);
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.setParameter(1, fromBillAmt);
		query.setParameter(2, toBillAmt);
		List<Customer> customers = query.getResultList();
		return customers;
	}

}
