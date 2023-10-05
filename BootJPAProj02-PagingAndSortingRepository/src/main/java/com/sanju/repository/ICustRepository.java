package com.sanju.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sanju.entities.Customer;

public interface ICustRepository
		extends PagingAndSortingRepository<Customer, Integer>, CrudRepository<Customer, Integer> {

}
