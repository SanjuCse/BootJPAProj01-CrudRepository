package com.sanju.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoronaPatient {
	private Integer patientId;
	private String patientName;
	private String patientAddress;
	private Character isCoronaActive;
}
