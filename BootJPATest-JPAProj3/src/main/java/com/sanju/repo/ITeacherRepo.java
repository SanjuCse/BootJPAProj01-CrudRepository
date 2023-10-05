package com.sanju.repo;

import org.springframework.data.repository.CrudRepository;

import com.sanju.entity.Teacher;

public interface ITeacherRepo extends CrudRepository<Teacher, Integer> {
}
