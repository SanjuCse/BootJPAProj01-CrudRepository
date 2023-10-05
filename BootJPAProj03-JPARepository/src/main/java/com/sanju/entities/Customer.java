package com.sanju.entities;

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

@Table(name = "CUSTOMER_DETAILS")
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@SequenceGenerator(sequenceName = "CUST_SEQ_01", name = "SEQ_01", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "SEQ_01", strategy = GenerationType.SEQUENCE)
	@Column(name = "CUST_ID")
	@Id
	private Integer cid;
	@Column(name = "CUST_NAME")
	@Nonnull
	private String cname;

	@Column(name = "CUST_ADDR")
	@Nonnull
	private String caddr;

	@Column(name = "CUST_BILL_AMT")
	@Nonnull
	private Float billAmt;
}
