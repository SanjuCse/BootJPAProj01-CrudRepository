package com.sanju.service;

import com.sanju.entities.CallerTuneInfo;

public interface ICallerTuneMgmtService {

	public String saveCallerTuneInfo(CallerTuneInfo callerTuneInfo);

	public String updateTuneInfoByID(Integer id, String tuneName, String movieName);

	public CallerTuneInfo showCallerTuneDetailsById(Integer id);
}
