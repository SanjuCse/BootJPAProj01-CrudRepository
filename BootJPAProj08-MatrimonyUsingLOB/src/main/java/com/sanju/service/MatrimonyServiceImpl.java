package com.sanju.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.MarriageSeekar;
import com.sanju.repo.IMatrimonyRepo;

@Service
public class MatrimonyServiceImpl implements IMatrimonyServiceMgmt {
	@Autowired
	IMatrimonyRepo matrimonyRepo;

	@Override
	public String registerMarriageSeekar(MarriageSeekar seekar) {
		MarriageSeekar save = matrimonyRepo.save(seekar);
		return save.getSeekarName() + " seekar data registered successfully with seekarID - " + save.getSeekarID();
	}

	@Override
	public Optional<MarriageSeekar> searchSeekerById(Long id) {
		return matrimonyRepo.findById(id);
	}
}
