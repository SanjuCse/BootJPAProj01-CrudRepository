package com.sanju.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.sanju.entity.Developer;

public interface IDevMgmtService {
	String SaveDevsMutilDetails(List<Developer> developers);
//
//	String deleteDevsByIDs(List<Integer> ids);
//
//	String deleteDevsByIDsCRUD(List<Integer> ids);
//
//	String flush();
//
//	Developer fetchADeveloperDetails(Integer id);
//
//	List<Developer> getAllDeveloperDetails(Example<Developer> example, Sort sort);

	List<Developer> findByName(String name);

	List<Developer> findByNameAndName(String name, String name2);

	List<Developer> findByNameOrName(String name, String name2);

	List<Developer> findBySalaryBetween(Double fromSal, Double toSal);
}
