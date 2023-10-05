package com.sanju.service;

import java.util.List;
import java.util.Optional;

import com.sanju.entities.Customer;

public interface ICustService {
	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt);

//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt, double toBillAmt2);
	public List<Customer> searchCustomersByAddress(String addr1, String addr2);

	public List<Object[]> showCustomersDataByBillAmt(Float startBillAmt, Float endBillAmt);

	public List<String> searchAllCustomersByCustID(Integer startCustId, Integer endCustId);

	public Optional<Customer> showCustomerInfoByName(String name);

	public Object showCustomerDataByName(String name);

	public String showAddressByName(String name);

	public int fetchCustomersNameCount();

	public Object fetchAggregateData();

	public int discountOfTwoHundredForEachCustomer();

	public int revomeCustomersByRange(Double start, Double end);

	public int registerCustomer(double cust_bill_amt, String cust_addr, String cust_name);

	public int updateSeqValue();

	public String showSystemDate();

	public String createTable();
}
