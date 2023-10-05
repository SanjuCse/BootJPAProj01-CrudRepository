package com.sanju.dao;

import java.util.List;

import com.sanju.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeesByDesgs(String Desg1, String Desg2, String Desg3) throws Exception;
}
