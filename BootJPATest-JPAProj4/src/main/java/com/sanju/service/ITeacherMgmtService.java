package com.sanju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.sanju.entity.Teacher;

public interface ITeacherMgmtService {
	List<Teacher> showTeachersDetailsBySorting(boolean isASC, String string);

	Page<Teacher> showTeachersByPages(int page, int size);

	Page<Teacher> showTeachersByPages(int page, int size, Sort sort);
}
