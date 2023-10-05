package com.sanju.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanju.model.CoronaPatient;

@Repository("pDao")
public class PatientDAOInfoImpl implements IPatientInfoDAO {

	public static final String CORONA_PATIENT_INFO_STATE_WISE = "SELECT PATIENT_ID, PATIENT_NAME, PATIENT_ADDRESS, IS_CORONA_ACTIVE FROM CORONA_PATIENTS WHERE PATIENT_ADDRESS IN (? ,? , ?) ORDER BY PATIENT_ADDRESS";

	@Autowired
	private DataSource dataSource;

	@Override
	public List<CoronaPatient> getCoronaPatientInfoStateWise(String state1, String state2, String state3)
			throws Exception {
		System.out.println("PatientInfoImpl.getCoronaPatientInfoStateWise()");
		List<CoronaPatient> cPatients = null;

		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(CORONA_PATIENT_INFO_STATE_WISE);) {
			pstmt.setString(1, state1);
			pstmt.setString(2, state2);
			pstmt.setString(3, state3);

			try (ResultSet resultSet = pstmt.executeQuery()) {
				cPatients = new ArrayList<>();

				while (resultSet.next()) {
					CoronaPatient coronaPatient = new CoronaPatient();
					coronaPatient.setPatientId(resultSet.getInt(1));
					coronaPatient.setPatientName(resultSet.getString(2));
					coronaPatient.setPatientAddress(resultSet.getString(3));
					coronaPatient.setIsCoronaActive(resultSet.getString(4).charAt(0));

					cPatients.add(coronaPatient);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return cPatients;
	}

}
