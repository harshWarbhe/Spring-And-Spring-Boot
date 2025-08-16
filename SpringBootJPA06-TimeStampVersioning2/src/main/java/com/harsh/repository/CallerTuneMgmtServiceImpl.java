package com.harsh.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.entity.CallerTuneInfo;
import com.harsh.service.ICallerTuneMgmtService;

@Service
public class CallerTuneMgmtServiceImpl implements ICallerTuneMgmtService {

	@Autowired
	private ICallerTuneInfoRepository callerTuneRepo;

	@Override
	public String saveCallerTuneInfo(CallerTuneInfo info) {
		Integer idVal = callerTuneRepo.save(info).getTuneId();
		return "\nTune id is save with the id value : " + idVal;
	}

	@Override
	public String updateTuneInfoById(Integer tuneId, String tuneName, String movieName) {
		Optional<CallerTuneInfo> byId = callerTuneRepo.findById(tuneId);
		if (byId.isPresent()) {
			CallerTuneInfo info = byId.get();
			info.setTuneName(tuneName);
			info.setMovieName(movieName);
			CallerTuneInfo saveTune = callerTuneRepo.save(info);
			return "\nObject is updated for " + saveTune.getUpdatedCount() + " times... lastly modified on : "
					+ saveTune.getLastlyUpdatedOn() + "... Created on : " + saveTune.getServiceOptedOn();
		} else
			return "Caller tune service not found";
	}

	@Override
	public CallerTuneInfo showCallerTuneDetailById(Integer id) {
		return callerTuneRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("caller tune not found"));
	}

}
