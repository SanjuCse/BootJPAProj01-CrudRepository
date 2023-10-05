package com.sanju.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanju.collections.Address;

public interface IAddressRepo extends MongoRepository<Address, String> {

}
