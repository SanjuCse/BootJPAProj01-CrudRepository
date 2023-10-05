package com.sanju.service;

import java.util.List;

import com.sanju.model.CoronaPatient;

public interface IpatientsService {
	public List<CoronaPatient> getCoronaPatientInfoStateWise(String state1, String state2, String state3)
			throws Exception;
}
