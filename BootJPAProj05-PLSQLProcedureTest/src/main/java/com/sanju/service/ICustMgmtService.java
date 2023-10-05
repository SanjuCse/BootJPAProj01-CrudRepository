package com.sanju.service;

import java.util.List;

import com.sanju.entities.Customer;

public interface ICustMgmtService {
	List<Customer> showCustomersByBillAmount(Float fromBillAmt, Float toBillAmt);
}
