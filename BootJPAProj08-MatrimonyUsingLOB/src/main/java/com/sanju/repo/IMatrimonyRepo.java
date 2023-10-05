package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.MarriageSeekar;

public interface IMatrimonyRepo extends JpaRepository<MarriageSeekar, Long> {

}