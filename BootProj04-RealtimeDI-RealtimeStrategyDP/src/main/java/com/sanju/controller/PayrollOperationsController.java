package com.sanju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sanju.model.Employee;
import com.sanju.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationsController {
	@Autowired
	private IEmployeeMgmtService service;

	public List<Employee> showEmployeesByDesg(String Desg1, String Desg2, String Desg3) throws Exception {
		System.out.println("PayrollOperationsController.showEmployeesByDesg()");
		List<Employee> list = service.fetchEmployeeByDesgs(Desg1, Desg2, Desg3);
		return list;
	}
}
