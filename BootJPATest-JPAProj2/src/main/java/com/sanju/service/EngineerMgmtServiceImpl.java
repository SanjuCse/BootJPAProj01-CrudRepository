package com.sanju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entity.Engineer;
import com.sanju.repo.IEnginerRepo;

@Service
public class EngineerMgmtServiceImpl implements IEngineerMgmtService {

	@Autowired
	private IEnginerRepo repo;

	@Override
	public String saveEngineerDetails(Engineer engineer) {
		repo.save(engineer);
		return "Engineer Details registered successfullly with " + engineer.getEid() + " EID";
	}

	@Override
	public String saveEngineersDetails(List<Engineer> engineer) {
		Iterable<Engineer> engineers = repo.saveAll(engineer);
//		engineers.forEach(eng -> {
//			eng.getEid();
//		});

		return "Engineers Details registered successfullly.";
	}

	@Override
	public Optional<Engineer> loadAEnginnerDetails(Integer Id) {
		Optional<Engineer> engineer = repo.findById(Id);
		return engineer;
	}
}
