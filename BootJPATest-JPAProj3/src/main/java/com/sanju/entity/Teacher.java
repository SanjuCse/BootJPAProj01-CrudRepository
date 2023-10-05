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
@RequiredArgsConstructor
@NoArgsConstructor
public class Teacher {
	@Id
	@SequenceGenerator(name = "tSeqGen", sequenceName = "teacherIdGen", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "tSeqGen", strategy = GenerationType.SEQUENCE)
	private Integer tid;

	@Column(name = "teacher_name", length = 20)
	@Nonnull
	private String tName;

	@Column(length = 150)
	@Nonnull
	private String subject;

	@Nonnull
	private Boolean isTeaching;

	@Nonnull
	@Column(length = 1)
	private Character gender;

	@Nonnull
	@Column(name = "teacher_salary")
	private Float tSalary;
}
