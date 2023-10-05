package com.sanju.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Address {
	@Id
	private String sid;

	@Nonnull
	private String cityName;

	@Nonnull
	private String distName;

	@Nonnull
	private String stateName;

	@Nonnull
	private String countryName;

	@Nonnull
	private Integer pinCode;
}
