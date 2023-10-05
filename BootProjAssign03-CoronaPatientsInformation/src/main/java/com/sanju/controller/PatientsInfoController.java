package com.sanju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sanju.model.CoronaPatient;
import com.sanju.service.PatientsServiceImpl;

@Controller("pController")
public class PatientsInfoController {

	@Autowired
	private PatientsServiceImpl service;

	public List<CoronaPatient> getCoronaPatientInfoStateWise(String state1, String state2, String state3)
			throws Exception {

		List<CoronaPatient> patientInfo = service.getCoronaPatientInfoStateWise(state1, state2, state3);

		return patientInfo;
	}
}
