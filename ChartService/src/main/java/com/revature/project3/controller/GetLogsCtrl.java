package com.revature.project3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project3.bean.Logs;
import com.revature.project3.service.LogsService;

@RestController
public class GetLogsCtrl {

	@Autowired
	LogsService service;
	
	// Returns all logs for the story service.
	@GetMapping("/chartLogs")
	public List<Logs> getAllLogs() {
		return service.getAllLogs();
	}
	
	// Returns logs based on the current day.
	@GetMapping("/chartCurrentLogs")
	public List<Logs> getAllCurrentLogs() {
		return service.getLogsByDate();
	}
}
