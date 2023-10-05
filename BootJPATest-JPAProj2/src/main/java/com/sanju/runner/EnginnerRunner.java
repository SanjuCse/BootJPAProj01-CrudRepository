package com.sanju.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entity.Engineer;
import com.sanju.service.IEngineerMgmtService;

@Component
public class EnginnerRunner implements CommandLineRunner {

	@Autowired
	private IEngineerMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		Engineer engineer = new Engineer();
		engineer.setEname("Madhab");
		engineer.setEsalary(35000.0);
		engineer.setOrgName("XYZ Ltd.");
		engineer.setSpecialization("SAP HANA Developer");
		String msg = service.saveEngineerDetails(engineer);
		System.out.println(msg);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Engineer engineer = new Engineer("Iti Jaan❤️", "Team Leader", 80000.0, "IBM Ltd");
//		Engineer engineer1 = new Engineer("Lisa 🤣", "Pharmacist", 120000.0, "Cipla Ltd");
//		Engineer engineer2 = new Engineer("Saraswati 💕", "Sr Accoutant", 580000.0, "Bajaj Finance Ltd");
//		Engineer engineer3 = new Engineer("Kalpana 😍", "Teacher", 15000.0, "GIET");
//
//		List<Engineer> engineers = List.of(engineer, engineer1, engineer2, engineer3);
//		engineers.add(engineer);
//		engineers.add(engineer1);
//		engineers.add(engineer2);
//		engineers.add(engineer3);
//
//		String msg = service.saveEngineersDetails(engineers);
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Integer id = 15;
//		Optional<Engineer> optional = service.loadAEnginnerDetails(id);
//		Engineer engineer = null;
//		if (optional.isPresent()) {
//			engineer = optional.get();
//			System.out.println(engineer);
//		} else {
//			System.out.println("Provided ID not availeble in Database");
//		}
//	}
}
