package com.sanju.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sanju.collections.Address;

public interface IAddressMgmtService {
	String registerAddress(Address address);

	List<Address> fetchAllAddresses();

	String showInJSON(Address address) throws JsonProcessingException;

}
