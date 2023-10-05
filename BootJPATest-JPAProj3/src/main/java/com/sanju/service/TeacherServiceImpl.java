package com.sanju.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entity.Teacher;
import com.sanju.repo.ITeacherRepo;

@Service
public class TeacherServiceImpl implements ITeacherMgmtService {

	@Autowired
	private ITeacherRepo repo;

	@Override
	public String saveTeacherDetails(Teacher teacher) {
		repo.save(teacher);
		return "Teacher Details saved with ID - " + teacher.getTid();
	}

	@Override
	public String saveTeachersDetails(List<Teacher> teachers) {
		Iterable<Teacher> teachersDetails = repo.saveAll(teachers);
		List<Integer> IDs = new ArrayList<>();
		for (Teacher teacher : teachersDetails) {
			IDs.add(teacher.getTid());
		}
		return "Teachers Details saved, with IDs - " + Arrays.toString(IDs.toArray());
	}

	@Override
	public boolean isTeacherAvailble(Integer Id) {
		return repo.existsById(Id);
	}

	@Override
	public Optional<Teacher> fetchTeacherDetails(Integer Id) {
		Optional<Teacher> teacher = repo.findById(Id);
		return teacher;
	}

	@Override
	public List<Teacher> fetchAllTeacherDetails() {
		return (List<Teacher>) repo.findAll();
	}

	@Override
	public List<Teacher> fetchAllTeacherDetailsByID(Iterable<Integer> IDs) {
		return (List<Teacher>) repo.findAllById(IDs);
	}

	@Override
	public long fetchTeacherCount() {
		return repo.count();
	}

	@Override
	public String deleteATeacher(Integer id) {
		if (isTeacherAvailble(id)) {
			repo.deleteById(id);
			return "Teacher is found and deleted with the specified ID - " + id;
		} else {
			return "Teacher is not available with the specified ID - " + id;
		}
	}

	@Override
	public String deleteATeacher(Teacher teacher) {
		Integer id = teacher.getTid();
		if (isTeacherAvailble(teacher.getTid())) {
			repo.deleteById(id);
			return "Teacher is found and deleted with the specified ID - " + id;
		} else {
			return "Teacher is not available with the specified ID - " + id;
		}
	}

	@Override
	public String deleteMultipleTeachersByIDs(List<Integer> ids) {
		Integer[] bothAvailbleAndUnavalableTeachers = new Integer[2];

		List<Integer> availableTeachers = new ArrayList<>();
		List<Integer> unavailableTeachers = new ArrayList<>();
		for (Integer id : ids) {
			if (isTeacherAvailble(id)) {
				availableTeachers.add(id);
			} else {
				unavailableTeachers.add(id);
			}
		}
		repo.deleteAllById(ids);
		return "Available Teachers are " + Arrays.toString(availableTeachers.toArray()) + " found and deleted. "
				+ " Unavailable teachers are " + Arrays.toString(unavailableTeachers.toArray());
	}

	@Override
	public String deleteAllTeacher(List<Teacher> teachers) {
		List<Integer> availableTeachers = new ArrayList<>();
		List<Integer> unavailableTeachers = new ArrayList<>();
		for (Teacher teacher : teachers) {
			Integer id = teacher.getTid();
			if (isTeacherAvailble(id)) {
				availableTeachers.add(id);
			}
		}

		repo.deleteAll(teachers);
		return "Available Teachers are " + Arrays.toString(availableTeachers.toArray()) + " found and deleted.";
	}

	@Override
	public String updateATeacherDetail(Integer id) {
		
		if (isTeacherAvailble(id)) {
			Teacher teacher = fetchTeacherDetails(id).get();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Updated teacher name");
			teacher.setTName(scanner.nextLine());
			System.out.println("Enter Updated teacher salary");
			teacher.setTSalary(scanner.nextFloat());
//			repo.save(teacher);
			saveTeacherDetails(teacher);
			return "Teacher Details Updated Successfully";
		} else {
			return "Provided ID " + id + " Teacher detail isn't available.";
		}
	}
}
