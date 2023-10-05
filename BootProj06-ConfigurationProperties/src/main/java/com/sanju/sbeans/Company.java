package com.sanju.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Component("company")
@ConfigurationProperties(prefix = "my.company")
public class Company {
	private String id;
	private String name;
	private String addr;

}
