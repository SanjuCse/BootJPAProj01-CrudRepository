package com.sanju.service;

import java.util.Optional;

import com.sanju.entities.MarriageSeekar;

public interface IMatrimonyServiceMgmt {
	public String registerMarriageSeekar(MarriageSeekar seekar);

	public Optional<MarriageSeekar> searchSeekerById(Long id);
}
