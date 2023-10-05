package com.sanju.repo;

import com.sanju.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {

}
