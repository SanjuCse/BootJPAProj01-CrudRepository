package com.sanju.service;

import java.util.List;

import com.sanju.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchEmployeeByDesgs(String Desg1, String Desg2, String Desg3) throws Exception;
}
