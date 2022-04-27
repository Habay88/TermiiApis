package com.termii.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.termii.model.Staff;
import com.termii.model.Visitor;
@Service
public interface VisitorService {

	Visitor saveVisitor(Visitor visitor);

	List<Visitor> findAllVisitors();

	Optional<Visitor> findOne(int id);

	Visitor save(Visitor visitor);

	Visitor saveVisitor(Visitor visitor, Staff staff_id);

}
