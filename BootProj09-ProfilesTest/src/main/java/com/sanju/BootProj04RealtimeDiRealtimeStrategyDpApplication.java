package com.sanju;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sanju.controller.PayrollOperationsController;
import com.sanju.model.Employee;

@SpringBootApplication
public class BootProj04RealtimeDiRealtimeStrategyDpApplication {
	@Autowired
	private Environment environment;

	@Bean(name = "C3P0DS")
	@Profile("test")
	public ComboPooledDataSource createC3P0DS() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(environment.getProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(environment.getProperty("spring.datasource.url"));
		cpds.setUser(environment.getProperty("spring.datasource.username"));
		cpds.setPassword(environment.getProperty("spring.datasource.password"));

		cpds.setMinPoolSize(Integer.parseInt(environment.getProperty("c3p0.minSize")));
		cpds.setMaxPoolSize(Integer.parseInt(environment.getProperty("c3p0.maxSize")));
		return cpds;
	}

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
