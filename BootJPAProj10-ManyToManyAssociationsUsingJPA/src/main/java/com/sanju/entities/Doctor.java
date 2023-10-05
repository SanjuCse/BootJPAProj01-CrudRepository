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
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "MTM_Doctor_Tab")
//@NoArgsConstructor
@RequiredArgsConstructor
public class Doctor implements Serializable {
	@Id
	@SequenceGenerator(name = "DidSeqGen", sequenceName = "DidSeqGen", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "DidSeqGen", strategy = GenerationType.SEQUENCE)
//	@Column(name = "did")
	private Integer did;

	@Nonnull
	@Column(name = "Doctor_Name", length = 20)
	private String dname;

	@Nonnull
	@Column(name = "Doctor_Specialization", length = 20)
	private String specialization;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Patient.class)
	@JoinTable(name = "JPA_MTM_DOCTORS_PATIENTS", joinColumns = @JoinColumn(name = "doctor_id", referencedColumnName = "did"), inverseJoinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "pid"))
	private List<Patient> patients;

	public Doctor() {
		System.out.println("Doctor: 0-param Constructor)");
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", specialization=" + specialization + "]";
	}

}
