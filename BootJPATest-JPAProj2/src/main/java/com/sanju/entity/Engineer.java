package com.sanju.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Engineer_Tab")
public class Engineer {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "engineer_seq_gen1", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer eid;

	@Nonnull
	@Column(name = "ENGINEER_NAME", length = 20)
	private String ename;

	@Nonnull
	@Column(name = "ENGINNER_SPECIALIZATION", length = 20)
	private String specialization;

	@Nonnull
	@Column(name = "ENGINEER_SALARY")
	private Double esalary;

	@Nonnull
	@Column(name = "ORGANISATION_NAME", length = 30)
	private String orgName;
}
