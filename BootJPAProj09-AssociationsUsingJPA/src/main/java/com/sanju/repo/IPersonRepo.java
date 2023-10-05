package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
