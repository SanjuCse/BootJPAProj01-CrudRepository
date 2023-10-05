package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanju.collections.Address;
import com.sanju.repo.IAddressRepo;

@Service
public class AddressService implements IAddressMgmtService {
	@Autowired
	private IAddressRepo repo;

	@Override
	public String registerAddress(Address address) {
		return "Address has been registered with ID - " + repo.save(address).getSid();
	}

	@Override
	public List<Address> fetchAllAddresses() {
		return repo.findAll();
	}

	@Override
	public String showInJSON(Address address) throws JsonProcessingException {
		return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(address);
	}

}
