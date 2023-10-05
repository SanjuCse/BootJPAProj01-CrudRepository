package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.PhoneNumber;

public interface IphoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
