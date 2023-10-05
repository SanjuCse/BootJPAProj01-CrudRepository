package com.sanju.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sanju.entity.Developer;
import com.sanju.repo.IDeveloperRepo;

@Service
public class DevServiceImpl implements IDevMgmtService {
	@Autowired
	private IDeveloperRepo repo;

	@Override
	public String SaveDevsMutilDetails(List<Developer> developers) {
		List<Developer> devs = (List<Developer>) repo.saveAll(developers);
		Set<Integer> ids = new HashSet<>();
		for (Developer developer : devs) {
			ids.add(developer.getDid());
		}
		return "Alll developers details saved with Ids - " + Arrays.toString(ids.toArray());
	}
//
//	@Override
//	public String deleteDevsByIDs(List<Integer> ids) {
//		repo.deleteAllByIdInBatch(ids);
//		return "Specified Developer Details Removed successfully";
//	}
//
//	@Override
//	public String deleteDevsByIDsCRUD(List<Integer> ids) {
//		repo.deleteAllById(ids);
//		return "Specified Developer Details Removed successfully";
//	}
//
//	@Override
//	public String flush() {
//		repo.flush();
//		return "Flush Done";
//	}
//
//	@Override
//	public Developer fetchADeveloperDetails(Integer id) {
//		return repo.getOne(id);
//	}
//
//	@Override
//	public List<Developer> getAllDeveloperDetails(Example<Developer> example, Sort sort) {
//		return repo.findAll(example, sort);
//	}

	@Override
	public List<Developer> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Developer> findByNameAndName(String name, String name2) {
		return repo.findByNameAndName(name, name2);
	}

	@Override
	public List<Developer> findByNameOrName(String name, String name2) {
		return repo.findByNameOrName(name, name2);
	}

	@Override
	public List<Developer> findBySalaryBetween(Double fromSal, Double toSal) {
		return repo.findBySalaryBetween(fromSal, toSal);
	}
}
