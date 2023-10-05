package com.sanju.repo;

import org.springframework.data.repository.CrudRepository;

import com.sanju.entity.Developer;
import java.util.List;

public interface IDeveloperRepo extends CrudRepository<Developer, Integer> {
	List<Developer> findByName(String name);

	List<Developer> findByNameAndName(String name, String name2);

	List<Developer> findByNameOrName(String name, String name2);

	List<Developer> findBySalaryBetween(Double fromSal, Double toSal);
}
