package com.sanju.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.entities.Doctor;
import com.sanju.entities.Patient;
import com.sanju.repo.IDoctorRepo;
import com.sanju.repo.IPatientRepo;

@Service
public class MtoMMgmtServiceImpl implements IMToMMgmtService {
	@Autowired
	private IDoctorRepo doctorRepo;

	@Autowired
	private IPatientRepo patientRepo;

	@Override
	public List<Doctor> loadDataUsingDoctor() {
		List<Doctor> doctorsList = doctorRepo.findAll();
		return doctorsList;
	}

	@Override
	public void loadDataUsingPatient() {

	}

	@Override
	public String saveDataUsingDoctor(Doctor doctor1, Doctor doctor2, Patient patient1, Patient patient2,
			Patient patient3, Patient patient4) {

		List<Patient> doc1Patients = new ArrayList<>();
		doc1Patients.add(patient1);
		doc1Patients.add(patient2);

		List<Patient> doc2Patients = new ArrayList<>();
		doc2Patients.add(patient3);
		doc2Patients.add(patient4);

		doctor1.setPatients(doc1Patients);
		doctor2.setPatients(doc2Patients);

//		doctor1.setPatients(List.of(patient1, patient2));
//		doctor2.setPatients(List.of(patient3, patient4));

		List<Doctor> pat1Docs = new ArrayList<Doctor>();
		pat1Docs.add(doctor1);
		patient1.setDoctors(pat1Docs);

		List<Doctor> pat2Docs = new ArrayList<Doctor>();
		pat2Docs.add(doctor2);
		patient2.setDoctors(pat2Docs);

		List<Doctor> pat3Docs = new ArrayList<Doctor>();
		pat3Docs.add(doctor1);
		pat3Docs.add(doctor2);
		patient2.setDoctors(pat3Docs);

		List<Doctor> pat4Docs = new ArrayList<Doctor>();
		pat4Docs.add(doctor2);
		patient2.setDoctors(pat4Docs);

		List<Doctor> doctors = doctorRepo.saveAll(List.of(doctor1, doctor2));

		Iterator<Doctor> iterator = doctors.iterator();
		Integer[] listOfDid = new Integer[doctors.size()];
		while (iterator.hasNext()) {
			Doctor doctor = (Doctor) iterator.next();
			for (int i = 0; i < doctors.size(); i++) {
				listOfDid[i] = doctor.getDid();
			}
		}
//		List<Integer> listOfDid = new ArrayList<>();
//		for (Doctor doctor : doctors) {
//			listOfDid.add(doctor.getDid());
//		}
		return "Doctor and respective patient details has been saved with Doctor IDs : " + Arrays.toString(listOfDid);
	}

	@Override
	public String saveDataUsingPatient(Doctor doctor1, Doctor doctor2, Patient patient1, Patient patient2,
			Patient patient3, Patient patient4) {
		doctor1.setPatients(List.of(patient1, patient2, patient3));
		doctor2.setPatients(List.of(patient3, patient4));

		patient1.setDoctors(List.of(doctor1));
		patient2.setDoctors(List.of(doctor2));
		patient3.setDoctors(List.of(doctor1, doctor2));
		patient1.setDoctors(List.of(doctor2));

		List<Patient> patients = patientRepo.saveAll(List.of(patient1, patient2, patient3, patient4));
		List<Integer> listOfPid = Collections.emptyList();
		for (Patient patient : patients) {
			listOfPid = List.of(patient.getPid());
		}
		return "Patient and respective doctors details has been saved with patient IDs : "
				+ Arrays.toString(listOfPid.toArray());
	}

}
