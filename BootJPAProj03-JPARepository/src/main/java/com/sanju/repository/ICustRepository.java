package com.sanju.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.Customer;

public interface ICustRepository extends JpaRepository<Customer, Integer> {

}
