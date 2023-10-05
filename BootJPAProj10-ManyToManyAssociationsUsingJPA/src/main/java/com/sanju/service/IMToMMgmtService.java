package com.sanju.service;

import java.util.List;

import com.sanju.entities.Doctor;
import com.sanju.entities.Patient;

public interface IMToMMgmtService {
	String saveDataUsingDoctor(Doctor doctor1, Doctor doctor2, Patient patient1, Patient patient2, Patient patient3,
			Patient patient4);

	String saveDataUsingPatient(Doctor doctor1, Doctor doctor2, Patient patient1, Patient patient2, Patient patient3,
			Patient patient4);

	List<Doctor> loadDataUsingDoctor();

	void loadDataUsingPatient();
}
