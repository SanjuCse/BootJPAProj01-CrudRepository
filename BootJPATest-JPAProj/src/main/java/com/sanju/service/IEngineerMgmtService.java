package com.sanju.service;

import java.util.List;
import java.util.Optional;

import com.sanju.entity.Engineer;

public interface IEngineerMgmtService {
	String saveEngineerDetails(Engineer engineer);

	String saveEngineersDetails(List<Engineer> engineer);

	Optional<Engineer> loadAEnginnerDetails(Integer Id);
}