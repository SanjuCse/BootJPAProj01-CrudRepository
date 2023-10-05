package com.sanju.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.sanju.entities.CallerTuneInfo;
import com.sanju.repo.ICallerTuneRepo;

import jakarta.transaction.Transactional;

@Service
public class CallerTuneMgmtServiceImpl implements ICallerTuneMgmtService {

	@Autowired
	private ICallerTuneRepo callerTuneRepo;

	@Override
	public String saveCallerTuneInfo(CallerTuneInfo callerTuneInfo) {
		callerTuneRepo.save(callerTuneInfo);
		return "CallerTune info saved with tune ID: " + callerTuneInfo.getTuneID();
	}

	@Override
	@Transactional
	@Modifying
	public String updateTuneInfoByID(Integer id, String tuneName, String movieName) {
//		CallerTuneInfo callerTuneInfo = 
		Optional<CallerTuneInfo> callerTuneOpt = callerTuneRepo.findById(id);
		if (callerTuneOpt.isPresent()) {
			CallerTuneInfo callerTuneInfo = callerTuneOpt.get();
			String oldTuneName = callerTuneInfo.getTuneName();

			callerTuneInfo.setTuneName(tuneName);
			callerTuneInfo.setMovieName(movieName);

			callerTuneRepo.save(callerTuneInfo);
			return oldTuneName + " Caller Tune Info updated with " + callerTuneInfo.getTuneName() + ", "
					+ callerTuneInfo.getUpdateCount() + " number of times updated, " + " Last Updated on "
					+ callerTuneInfo.getLastlyUpdatedOn() + ", Initially registered on "
					+ callerTuneInfo.getServiceOptedOn();
		} else {
			return "Caller tune is not available with this ID " + id;
		}
	}

	@Override
	public CallerTuneInfo showCallerTuneDetailsById(Integer id) {
		return callerTuneRepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException(" Unable to found Caller ID with the ID " + id));
	}

}
