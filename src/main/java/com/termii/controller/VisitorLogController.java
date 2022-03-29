package com.termii.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.termii.model.Staff;
import com.termii.model.Visitor;
import com.termii.model.VisitorLog;
import com.termii.service.StaffService;
import com.termii.service.VisitorLogService;
import com.termii.service.VisitorService;

@RestController
@RequestMapping("visit")
public class VisitorLogController {

	@Autowired
	VisitorLogService visitorLogService;
	@Autowired 
	StaffService staffService;
	
	@Autowired 
	VisitorService visitorService;
	

	
	 @PostMapping 
	    public ResponseEntity<?> saveLogs(@RequestBody VisitorLog visitorlog, Staff staffId,Visitor visitorId)
	    {
	        return new ResponseEntity<>(visitorLogService.saveVisitorLog(visitorlog, staffId, visitorId), HttpStatus.CREATED);
	    }
	 
	 @GetMapping 
	    public ResponseEntity<?> getAllLogs(@RequestBody VisitorLog visitorlog, Staff staffId,Visitor visitorId)
	    {
	        return new ResponseEntity<>(visitorLogService.saveVisitorLog(visitorlog, staffId, visitorId), HttpStatus.CREATED);
	    }

}
