package com.sanju.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.annotation.Nonnull;
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

@Table(name = "CUSTOMER_INFO")
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@SequenceGenerator(sequenceName = "CUST_INFO_SEQ_01", name = "SEQ_INFO_01", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "SEQ_INFO_01", strategy = GenerationType.SEQUENCE)
	@Column(name = "CUST_ID")
	@Id
	private Integer cid;
	@Column(name = "CUST_NAME", length = 20)
	@Nonnull
	private String cname;

	@Column(name = "CUST_ADDR", length = 20)
	@Nonnull
	private String caddr;

	@Column(name = "CUST_BILL_AMT")
	@Nonnull
	private Float billAmt;

	@Column(name = "CUST_DOB")
	@Nonnull
	private LocalDateTime dob;

	@Column(name = "TIME_OF_PURCHASE")
	@Nonnull
	private LocalTime top;

	@Column(name = "DATE_OF_PURCHASE")
	@Nonnull
	private LocalDate dop;

}
