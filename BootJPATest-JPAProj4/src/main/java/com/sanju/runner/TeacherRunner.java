package com.sanju.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.sanju.entity.Teacher;
import com.sanju.service.ITeacherMgmtService;

@Component
public class TeacherRunner implements CommandLineRunner {

	@Autowired
	ITeacherMgmtService service;

//	@Override
//	public void run(String... args) throws Exception {
//		List<Teacher> teachers = service.showTeachersDetailsBySorting(true, "tSalary");
//		for (Teacher teacher : teachers) {
//			System.out.println(teacher);
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		int page = 1;
//		int size = 2;
//
//		Page<Teacher> pageTeacher = service.showTeachersByPages(page, size);
//		List<Teacher> teacherContent = pageTeacher.getContent();
//		for (Teacher teacher : teacherContent) {
//			System.out.println(teacher);
//		}
//	}

	@Override
	public void run(String... args) throws Exception {
		int page = 0;
		int size = 5;

		Page<Teacher> pageTeacher = service.showTeachersByPages(page, size, Sort.by(Direction.ASC, "tName"));
		List<Teacher> teacherContent = pageTeacher.getContent();
		for (Teacher teacher : teacherContent) {
			System.out.println(teacher);
		}
	}
}
