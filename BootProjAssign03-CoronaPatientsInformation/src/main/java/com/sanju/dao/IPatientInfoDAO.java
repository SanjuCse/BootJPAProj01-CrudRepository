package com.sanju.dao;

import java.util.List;

import com.sanju.model.CoronaPatient;

public interface IPatientInfoDAO {
	public List<CoronaPatient> getCoronaPatientInfoStateWise(String state1, String state2, String state3) throws Exception;
}
