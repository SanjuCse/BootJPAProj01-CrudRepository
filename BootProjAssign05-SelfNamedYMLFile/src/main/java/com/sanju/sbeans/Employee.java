package com.sanju.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.sanju.cfg.YamlPropertySourceFactory;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Component("employee")
@ConfigurationProperties(prefix = "com.sanju")
@PropertySource(value = "classpath:foo.yml", factory = YamlPropertySourceFactory.class)
public class Employee {
	private Integer eno;
	private String ename;
	private String[] favColors;
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;
	private Company company;
}
