package com.sanju.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sanju.collections.Student;

public interface IStudentMgmtService {
	String registerStudent(Student student);

	String registerStudents(List<Student> students);

	Student fetchAStudent(String id);

	String showInJSON(Student student) throws JsonProcessingException;

	List<Student> fetchAllStudents();

	String deleteAStudentByID(String id);

	String updateStudentAddrById(String id, String newAddress);

	List<Student> showStudentsBySorting(boolean isAsc, String... props);

	List<Student> findByName(String name);

	List<Student> findByRegNo(Integer regNo);

	List<Student> findByRegNoBetweenStartToEnd(Integer regNo1, Integer regNo2);

	List<Student> findByNameAndRegNo(String name, Integer regNo);

	List<Student> findByRegNoLessThan(Integer regNo);
}
