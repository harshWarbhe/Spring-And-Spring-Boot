package com.harsh.service;

import com.harsh.entity.CallerTuneInfo;

public interface ICallerTuneMgmtService {

	String saveCallerTuneInfo(CallerTuneInfo info);
	String updateTuneInfoById(Integer tuneId, String tuneName, String movieName);
	CallerTuneInfo showCallerTuneDetailById(Integer id);
}
