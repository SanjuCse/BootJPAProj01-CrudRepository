package com.sanju.entities;

import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_OTM_PERSON")
//@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
//@ToString
public class Person {
	@Id
	@SequenceGenerator(name = "pSeq", sequenceName = "personIDSeqGen01", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(generator = "pSeq", strategy = GenerationType.SEQUENCE)
	private Integer pid;

	@Column(name = "Person_Name")
	@Nonnull
	private String pname;

	@Column(name = "Person_Address")
	@Nonnull
	private String paddr;

	@Column(name = "Phone_Numbers")
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "person")
//	@JoinColumn(name = "PERSON_ID", referencedColumnName = "pid")

	private Set<PhoneNumber> phoneNumbers;

	public Person() {
		System.out.println("Person: 0-param constructor");
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + "]";
	}
}