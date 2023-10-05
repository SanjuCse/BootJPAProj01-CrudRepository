package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.dao.PatientDAOInfoImpl;
import com.sanju.model.CoronaPatient;

@Service("pService")
public class PatientsServiceImpl implements IpatientsService {

	@Autowired
	private PatientDAOInfoImpl pDAO;

	@Override
	public List<CoronaPatient> getCoronaPatientInfoStateWise(String state1, String state2, String state3)
			throws Exception {
		List<CoronaPatient> patientInfoStateWise = pDAO.getCoronaPatientInfoStateWise(state1, state2, state3);
		return patientInfoStateWise;
	}

}
