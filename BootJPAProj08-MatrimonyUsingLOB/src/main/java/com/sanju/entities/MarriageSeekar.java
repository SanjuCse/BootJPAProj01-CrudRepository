package com.sanju.entities;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class MarriageSeekar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "SeekarIDGenerator")
	@SequenceGenerator(sequenceName = "SeekarIDGenerator", name = "SeekarIDGenerator", initialValue = 1000, allocationSize = 1)
	private Long seekarID;

	@Nonnull
	@Column(length = 20)
	private String seekarName;

	@Nonnull
	@Column(length = 30)
	private String seekarAddr;

	@Nonnull
	@Lob
	private byte[] photo;

	@Nonnull
	@Lob
	private char[] bioData;

	@Nonnull
	private boolean isIndian;
}