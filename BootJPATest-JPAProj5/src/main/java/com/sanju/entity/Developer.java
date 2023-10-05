package com.sanju.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Developer {
	@Id
	@GeneratedValue(generator = "didGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "didGen", sequenceName = "didGen", initialValue = 100, allocationSize = 1)
	private Integer did;

	@Nonnull
	@Column(name = "Dev_Name")
	private String name;

	@Nonnull
	@Column(name = "Company_Name")
	private String orgName;

	@Nonnull
	@Column(name = "Domain_Name")
	private String domainName;

	@Nonnull
	@Column(name = "Salary")
	private Double salary;
}
