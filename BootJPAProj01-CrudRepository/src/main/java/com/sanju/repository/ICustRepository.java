package com.sanju.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanju.entities.Customer;

public interface ICustRepository extends CrudRepository<Customer, Integer> {
}
