package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.CallerTuneInfo;

public interface ICallerTuneRepo extends JpaRepository<CallerTuneInfo, Integer> {

}
