package com.sanju;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.controller.PayrollOperationsController;
import com.sanju.model.Employee;

@SpringBootApplication
public class BootProj04RealtimeDiRealtimeStrategyDpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(BootProj04RealtimeDiRealtimeStrategyDpApplication.class, args);
		PayrollOperationsController controller = context.getBean("payroll", PayrollOperationsController.class);
		try {
			List<Employee> employeesByDesg = controller.showEmployeesByDesg("CLERK", "MANAGER", "SALESMAN");
			employeesByDesg.forEach(emp -> System.out.println(emp));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Internal Server Error: " + e.getMessage());
		} finally {
			context.close();
		}
	}
}
