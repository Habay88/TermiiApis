package com.termii.service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.termii.model.Staff;
import com.termii.model.Visitor;
import com.termii.model.VisitorLog;
import com.termii.repository.StaffRepository;
import com.termii.repository.VisitorLogRepository;
import com.termii.repository.VisitorRepository;

@Service
public class VistiorLogServiceLogImpl implements VisitorLogService{

	@Autowired
	VisitorLogRepository visitorLogRepository ;
	@Autowired
	StaffRepository staffrepo;
	@Autowired
	VisitorRepository visitorRepository;

	public VistiorLogServiceLogImpl(VisitorLogRepository visitorLogRepository) {
		
		this.visitorLogRepository = visitorLogRepository;
	}
	
	@Override
	 public VisitorLog saveVisitorLog(VisitorLog visitorlog,Staff staffId, Visitor visitorId) {
	 visitorlog.setCreateTime(LocalTime.now());
		 return visitorLogRepository.save(visitorlog);
	 }

	
}
