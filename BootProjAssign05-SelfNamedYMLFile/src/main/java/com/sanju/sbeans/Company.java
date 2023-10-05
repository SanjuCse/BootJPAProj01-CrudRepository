package com.sanju.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Component("company")
public class Company {
	private Integer id;
	private String name;
	private String addrs;
	private Integer size;

}
