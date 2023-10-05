package com.sanju.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "MTM_Patient_Tab")
public class Patient implements Serializable {
	@Id
//	@SequenceGenerator(name = "PidSeqGen", sequenceName = "PidSeqGen", initialValue = 100, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // generator = "PidSeqGen",
//	@Column(name = "pid")
	private Integer pid;

	@Nonnull
	@Column(name = "Patient_Name", length = 20)
	private String pname;

	@Nonnull
	@Column(name = "Patient_Age", precision = 3)
	private Integer age;

	@Nonnull
	@Column(name = "Health_Issue", length = 15)
	private String HealthIssue;

	@ManyToMany(targetEntity = Doctor.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "JPA_MTM_DOCTORS_PATIENTS", joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "pid"), inverseJoinColumns = @JoinColumn(name = "doctor_id", referencedColumnName = "did"))
	private List<Doctor> doctors;

	public Patient() {
		System.out.println("Patient: 0-param Constructor)");
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
}
