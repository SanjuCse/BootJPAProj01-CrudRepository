package com.sanju.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.Doctor;
import com.sanju.entities.Patient;
import com.sanju.service.IMToMMgmtService;

@Component
public class MtoMRunner implements CommandLineRunner {
	@Autowired
	private IMToMMgmtService service;

//	@Override
//	public void run(String... args) throws Exception {
//		Doctor doctor = new Doctor("kanhu", "ENT");
//		Doctor doctor2 = new Doctor("Madhab", "Ortho");
//
//		Patient patient = new Patient("Krushna", 23, "Tooth");
//		Patient patient2 = new Patient("Raama", 25, "Ear");
//		Patient patient3 = new Patient("Hari", 28, "Knee");
//		Patient patient4 = new Patient("Siba", 17, "Hand Crack");
//
//		String msg = service.saveDataUsingDoctor(doctor, doctor2, patient, patient2, patient3, patient4);
//		System.out.println(msg);
//	}

	@Override
	public void run(String... args) throws Exception {
		List<Doctor> doctors = service.loadDataUsingDoctor();
		doctors.forEach(doctor -> {
			System.out.println(doctor);
			List<Patient> patients = doctor.getPatients();
			patients.forEach(pat -> {
				System.out.println(pat);
			});
		});

//		doctors.forEach(System.out::println);

	}
}
