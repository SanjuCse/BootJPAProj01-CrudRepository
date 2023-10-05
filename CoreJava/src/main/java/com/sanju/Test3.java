package com.sanju;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(01, null);
		Employee employee2 = new Employee(02, "naaga");
		Employee employee3 = new Employee(03, "abhisek");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		if (employees.size() != 0 && employees.get(0) != null) {
			if (employees.get(0).getName() != null) {
				System.out.println(employees.get(0).getName().equals("sanju"));
			} else {
				System.out.println("Employee index no 0, employee name is null");
			}
		} else {
			System.out.println("List size is 0 or o-index position is null");
		}
	}
}
