package com.sanju.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Component("employee")
@ConfigurationProperties(prefix = "employee")
public class Employee {
	private Integer id;
	private String name;
	private String dept;
	private Double salary;
}
