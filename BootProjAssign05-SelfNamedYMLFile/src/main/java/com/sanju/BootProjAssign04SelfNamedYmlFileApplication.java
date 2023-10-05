package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Employee;

@SpringBootApplication
public class BootProjAssign04SelfNamedYmlFileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(BootProjAssign04SelfNamedYmlFileApplication.class, args);
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);

		context.close();
	}

}
