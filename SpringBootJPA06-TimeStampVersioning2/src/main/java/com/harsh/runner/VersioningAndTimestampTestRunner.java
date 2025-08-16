package com.harsh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.service.ICallerTuneMgmtService;

@Component
public class VersioningAndTimestampTestRunner implements CommandLineRunner {

	@Autowired
	private ICallerTuneMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
//		try {
//			CallerTuneInfo info = new CallerTuneInfo();
//			
//	        info.setTuneName("My Tune");
//	        info.setMovieName("My Movie");
//			System.out.println(service.saveCallerTuneInfo(info));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			 // Update example
            System.out.println(service.updateTuneInfoById(1, "New Tune", "New Movie"));

            // Show details
            //System.out.println(service.showCallerTuneDetailById(1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
