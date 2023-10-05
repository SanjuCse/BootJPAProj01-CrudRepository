package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.Customer;

public interface ICustRepo extends JpaRepository<Customer, Integer> {
	
}
