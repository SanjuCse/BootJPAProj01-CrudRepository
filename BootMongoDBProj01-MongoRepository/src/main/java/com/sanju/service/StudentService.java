package com.sanju.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanju.collections.Student;
import com.sanju.repo.IStudentRepo;

@Service
public class StudentService implements IStudentMgmtService {
	@Autowired
	private IStudentRepo repo;

	@Override
	public String showInJSON(Student student) throws JsonProcessingException {
		return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(student);
	}

	@Override
	public String registerStudent(Student student) {
		return "Student Details Registered with id - " + repo.save(student).getId();
	}

	@Override
	public Student fetchAStudent(String id) {
		Optional<Student> student = repo.findById(id);
		if (student.isPresent()) {
			return student.get();
		} else {
			System.out.println("Invalid ID");
		}
		return null;
	}

	@Override
	public List<Student> fetchAllStudents() {
		return repo.findAll();
	}

	@Override
	public String deleteAStudentByID(String id) {
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return "Provided ID Deleted Successfully";
		} else {
			return "ID not available";
		}
	}

	@Override
	public String updateStudentAddrById(String id, String newAddress) {
		if (id == null || newAddress == null) {
			return "ID and New Address should not be null";
		} else {
			if (repo.existsById(id)) {
				Student student = repo.findById(id).get();
				if (newAddress.isEmpty() || newAddress.isBlank()) {
					return "New Address should not be empty and blank";
				} else {
					student.setAddr(newAddress);
					repo.save(student);
					return "Student updated with new Address";
				}
			} else {
				return "Unable to find student with specified ID";
			}
		}
	}

	@Override
	public List<Student> showStudentsBySorting(boolean isAsc, String... props) {
		Student student = new Student();
//		student.setSRegNo(12345);
//		student.setSname("sanju");
//		student.setSaddr("Bampur");
		student.setAddr("Denkanala");
		List<Student> students = repo.findAll(Example.of(student), Sort.by(props));
		return students;
	}

	@Override
	public List<Student> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public String registerStudents(List<Student> students) {
		repo.saveAll(students);
		List<String> ids = new ArrayList<>();
		for (Student student : students) {
			for (int i = 0; i < students.size(); i++) {
				ids.add(student.getId());
			}
		}
		return "Multiple students registered successfully with IDs - " + Arrays.toString(ids.toArray());
	}

	@Override
	public List<Student> findByRegNo(Integer regNo) {
		return repo.findByRegNo(regNo);
	}

	@Override
	public List<Student> findByRegNoBetweenStartToEnd(Integer regNo1, Integer regNo2) {
		return repo.findByRegNoBetween(regNo1, regNo2);
	}

	@Override
	public List<Student> findByNameAndRegNo(String name, Integer regNo) {
		return repo.findByNameAndRegNo(name, regNo);
	}

	@Override
	public List<Student> findByRegNoLessThan(Integer regNo) {
		return repo.findByRegNoLessThan(regNo);
	}
}
