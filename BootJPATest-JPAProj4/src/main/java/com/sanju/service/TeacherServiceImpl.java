package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.sanju.entity.Teacher;
import com.sanju.repo.ITeacherRepo;

@Service
public class TeacherServiceImpl implements ITeacherMgmtService {

	@Autowired
	private ITeacherRepo repo;

//	@Override
//	public List<Teacher> showTeachersDetailsBySorting(boolean isASC, String... strings) {
//		return (List<Teacher>) repo.findAll(Sort.by(isASC ? Direction.ASC : Direction.DESC, strings));
//	}

	@Override
	public List<Teacher> showTeachersDetailsBySorting(boolean isASC, String string) {
		return (List<Teacher>) repo.findAll(Sort.by(isASC ? Order.asc(string) : Order.desc(string)));
	}

	@Override
	public Page<Teacher> showTeachersByPages(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Teacher> page2 = repo.findAll(pageable);
		return page2;
	}

	@Override
	public Page<Teacher> showTeachersByPages(int page, int size, Sort sort) {
		Pageable pageable = PageRequest.of(page, size, sort);
		Page<Teacher> page2 = repo.findAll(pageable);
		return page2;
	}
}
