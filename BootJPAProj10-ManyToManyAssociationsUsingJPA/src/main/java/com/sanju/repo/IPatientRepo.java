package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.Patient;

public interface IPatientRepo extends JpaRepository<Patient, Integer> {}
