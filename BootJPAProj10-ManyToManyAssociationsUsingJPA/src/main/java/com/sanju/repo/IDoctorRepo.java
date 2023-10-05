package com.sanju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entities.Doctor;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

}
