package com.sanju.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Person_Phone_Number")
@Setter
@Getter
//@NoArgsConstructor
@RequiredArgsConstructor
//@ToString
public class PhoneNumber {
	@Id
	@SequenceGenerator(name = "pNoSeq", sequenceName = "pNoSeq01", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(generator = "pNoSeq", strategy = GenerationType.SEQUENCE)
	private Integer pNoID;

	@Column(name = "Mobile_Number", length = 10)
	@Nonnull
	private Long mobileNumber;

	@Column(name = "SIM_PROVIDER")
	@Nonnull
	private String provider;

	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	private Person person;

	public PhoneNumber() {
		System.out.println("PhoneNumber: 0-param constructor");
	}

	@Override
	public String toString() {
		return "PhoneNumber [pNoID=" + pNoID + ", mobileNumber=" + mobileNumber + ", provider=" + provider + "]";
	}
}
