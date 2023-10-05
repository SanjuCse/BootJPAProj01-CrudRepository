package com.sanju.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer eno;
	private String eName;
	private String desg;
	private Double salary;
	private Integer deptNo;
}
