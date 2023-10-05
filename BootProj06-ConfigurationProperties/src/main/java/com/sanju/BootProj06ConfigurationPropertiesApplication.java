package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Company;
import com.sanju.sbeans.Employee;

@SpringBootApplication
public class BootProj06ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(BootProj06ConfigurationPropertiesApplication.class, args);
		Company company = context.getBean("company", Company.class);
		Employee employee = context.getBean("employee", Employee.class);

		// Company [id=C123, name=sanju ltd., addr=Mindspace, Raigurg, Hyderabad.]
		// Company(id=C123, name=sanju ltd., addr=Mindspace, Raigurg, Hyderabad.)
		System.out.println(company);

		// Employee [id=101, name=sanju, dept=IT, salary=15000.0]
		// Employee(id=101, name=sanju, dept=IT, salary=15000.0)
		System.out.println(employee);
	}

}
