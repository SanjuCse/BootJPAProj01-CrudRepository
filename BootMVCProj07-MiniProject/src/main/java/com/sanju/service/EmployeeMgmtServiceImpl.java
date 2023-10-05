package com.sanju.service;

import com.sanju.model.Employee;
import com.sanju.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
    @Autowired
    private IEmployeeRepo repo;

    @Override
    public String registerEmployee(Employee employee) {
        return "Employee is saved with ID value: " +repo.save(employee).getEmpno();
    }

    @Override
    public Employee getEmployeeByID(Integer id) {
        Employee employee = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Employee ID"));
        return employee;
    }

    @Override
    public Iterable<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public String updateEmployee(Employee employee) {
        return "Employee is Updated with ID Value ::"+repo.save(employee).getEmpno();
    }

    @Override
    public String deleteEmployeeByID(Integer id) {
        repo.deleteById(id);
        return "Employee ID "+id+" Deleted Successfully";
    }
}
