package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Employee;

@SpringBootApplication
public class BootProj07ConfigurationPropertiesToMultiTypesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(BootProj07ConfigurationPropertiesToMultiTypesApplication.class, args);
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);

		context.close();
	}
}
