package com.sanju.service;

import java.util.List;
import java.util.Optional;

import com.sanju.entity.Teacher;

public interface ITeacherMgmtService {
	String saveTeacherDetails(Teacher teacher);

	String saveTeachersDetails(List<Teacher> teachers);

	boolean isTeacherAvailble(Integer Id);

	Optional<Teacher> fetchTeacherDetails(Integer Id);

	List<Teacher> fetchAllTeacherDetails();

	List<Teacher> fetchAllTeacherDetailsByID(Iterable<Integer> IDs);

	long fetchTeacherCount();

	String deleteATeacher(Integer id);

	String deleteATeacher(Teacher teacher);

	String deleteMultipleTeachersByIDs(List<Integer> ids);

	String deleteAllTeacher(List<Teacher> teachers);

	String updateATeacherDetail(Integer id);
}
