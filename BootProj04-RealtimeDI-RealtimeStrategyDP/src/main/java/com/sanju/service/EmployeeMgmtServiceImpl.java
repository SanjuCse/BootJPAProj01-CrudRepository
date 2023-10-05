package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.dao.IEmployeeDAO;
import com.sanju.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeDAO employeeDAO;

	@Override
	public List<Employee> fetchEmployeeByDesgs(String Desg1, String Desg2, String Desg3) throws Exception {
		List<Employee> list = employeeDAO.getEmployeesByDesgs(Desg1, Desg2, Desg3);
		return list;
	}

}
