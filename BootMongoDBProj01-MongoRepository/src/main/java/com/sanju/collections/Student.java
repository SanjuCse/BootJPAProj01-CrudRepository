package com.sanju.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Document
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private String id;

	@Nonnull
	private Integer regNo;

	@Nonnull
	private String name;

	@Nonnull
	private String addr;
}
