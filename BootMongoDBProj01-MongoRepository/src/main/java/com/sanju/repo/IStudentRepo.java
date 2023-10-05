package com.sanju.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanju.collections.Student;

public interface IStudentRepo extends MongoRepository<Student, String> {
	List<Student> findByName(String name);

	List<Student> findByRegNo(Integer regNo);

	List<Student> findByRegNoBetween(Integer regNo1, Integer regNo2);

	List<Student> findByNameAndRegNo(String name, Integer regNo);

	List<Student> findByRegNoLessThan(Integer regNo);
}
