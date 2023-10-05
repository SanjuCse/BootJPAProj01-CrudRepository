package com.sanju.service;

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
	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt) {
		return custRepository.searchCustomersByBillAmount(fromBillAmt, toBillAmt);
	}

//	@Override
//	public List<Customer> searchCustomersByBillAmount(double fromBillAmt, double toBillAmt, double toBillAmt2) {
//		return custRepository.searchCustomersByBillAmount(fromBillAmt, toBillAmt, toBillAmt2);
//	}

	@Override
	public List<Customer> searchCustomersByAddress(String addr1, String addr2) {
		List<Customer> list = custRepository.searchCustomersByAddress(addr1, addr2);
		return list;
	}

	@Override
	public List<Object[]> showCustomersDataByBillAmt(Float startBillAmt, Float endBillAmt) {
		List<Object[]> list = custRepository.showCustomersDataByBillAmt(startBillAmt, endBillAmt);
		return list;
	}

	@Override
	public List<String> searchAllCustomersByCustID(Integer startCustId, Integer endCustId) {
		List<String> list = custRepository.searchAllCustomersByCustID(startCustId, endCustId);
		return list;
	}

	@Override
	public Optional<Customer> showCustomerInfoByName(String name) {
		Optional<Customer> optional = custRepository.showCustomerInfoByName(name);
		return optional;
	}

	@Override
	public Object showCustomerDataByName(String name) {
		Object object = custRepository.showCustomerDataByName(name);
		return object;
	}

	@Override
	public String showAddressByName(String name) {
		String string = custRepository.showAddressByName(name);
		return string;
	}

	@Override
	public int fetchCustomersNameCount() {
		int count = custRepository.fetchCustomersNameCount();
		return count;
	}

	@Override
	public Object fetchAggregateData() {
		Object aggregateData = custRepository.fetchAggregateData();
		return aggregateData;
	}

	@Override
	public int discountOfTwoHundredForEachCustomer() {
		int count = custRepository.discountOfTwoHundredForEachCustomer();
		return count;
	}

	@Override
	public int revomeCustomersByRange(Double start, Double end) {
		int count = custRepository.revomeCustomersByRange(start, end);
		return count;
	}

	@Override
	public int registerCustomer(double cust_bill_amt, String cust_addr, String cust_name) {
		int count = custRepository.registerCustomer(cust_bill_amt, cust_addr, cust_name);
		return count;
	}

	@Override
	public int updateSeqValue() {
		int count = custRepository.updateSeqValue();
		return count;
	}

	@Override
	public String showSystemDate() {
		return custRepository.showSystemDate();
	}

	@Override
	public String createTable() {
		int count = custRepository.createTable();
		return count == 0 ? "Table Created " + count : "Unable to create table " + count;
	}

}