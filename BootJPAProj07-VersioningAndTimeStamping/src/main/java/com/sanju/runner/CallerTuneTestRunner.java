package com.sanju.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entities.CallerTuneInfo;
import com.sanju.service.ICallerTuneMgmtService;

@Component
public class CallerTuneTestRunner implements CommandLineRunner {
	@Autowired
	private ICallerTuneMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		CallerTuneInfo callerTuneInfo = new CallerTuneInfo("Chand Sifarish", "Fanna");
		String tuneInfo = service.saveCallerTuneInfo(callerTuneInfo);
		System.out.println(tuneInfo);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		CallerTuneInfo tuneInfo = service.showCallerTuneDetailsById(10001);
//		System.out.println(tuneInfo);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String updateTuneInfoByID = service.updateTuneInfoByID(10000, "Aawara Shaam Hai",
//				"Song by MeetnPiyush");
//		System.out.println(updateTuneInfoByID);
//	}
}
