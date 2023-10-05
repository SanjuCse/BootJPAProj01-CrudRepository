package com.sanju;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.controller.PatientsInfoController;
import com.sanju.model.CoronaPatient;

@SpringBootApplication
public class CoronaPatientsInformationApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CoronaPatientsInformationApplication.class,
				args);
		PatientsInfoController controller = context.getBean("pController", PatientsInfoController.class);

		try {
			List<CoronaPatient> patientInfo = controller.getCoronaPatientInfoStateWise("Hyd", "Delhi", "Bombay");
			for (CoronaPatient coronaPatient : patientInfo) {
				System.out.println(coronaPatient);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong related to Database, please try again later");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong, please try again later");
		}
	}
}
