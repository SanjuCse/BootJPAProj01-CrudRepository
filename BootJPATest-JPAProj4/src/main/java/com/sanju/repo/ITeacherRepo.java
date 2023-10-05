package com.sanju.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sanju.entity.Teacher;

public interface ITeacherRepo extends PagingAndSortingRepository<Teacher, Integer> {

}
