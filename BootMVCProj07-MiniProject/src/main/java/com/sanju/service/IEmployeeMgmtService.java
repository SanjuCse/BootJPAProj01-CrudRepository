package com.sanju.service;

import com.sanju.model.Employee;

public interface IEmployeeMgmtService {
    Iterable<Employee> getAllEmployees();

    String registerEmployee(Employee employee);

    Employee getEmployeeByID(Integer id);

    String updateEmployee(Employee employee);

    String deleteEmployeeByID(Integer id);
}
