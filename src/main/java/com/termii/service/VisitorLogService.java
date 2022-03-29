package com.termii.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.termii.model.Staff;
import com.termii.model.Visitor;
import com.termii.model.VisitorLog;



public interface VisitorLogService {

	VisitorLog saveVisitorLog(VisitorLog visitorlog, Staff staffId, Visitor visitorId);




}
