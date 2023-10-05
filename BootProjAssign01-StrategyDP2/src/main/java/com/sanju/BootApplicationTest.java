package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Myntra;

@SpringBootApplication
public class BootApplicationTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootApplicationTest.class, args);
		Myntra myntra = context.getBean("myntra", Myntra.class);
		myntra.deliver();

		context.close();
	}

}
