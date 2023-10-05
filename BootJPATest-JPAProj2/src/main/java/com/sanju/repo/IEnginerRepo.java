package com.sanju.repo;

import org.springframework.data.repository.CrudRepository;

import com.sanju.entity.Engineer;

public interface IEnginerRepo extends CrudRepository<Engineer, Integer> {
}
