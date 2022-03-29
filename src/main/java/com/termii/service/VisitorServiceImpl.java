package com.termii.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.termii.model.Staff;
import com.termii.model.Visitor;
import com.termii.repository.StaffRepository;
import com.termii.repository.VisitorRepository;

@Service
public class VisitorServiceImpl  implements VisitorService {
	@Autowired
	VisitorRepository visitorRepository;
	
	@Autowired
	StaffRepository staffRepository;

	public VisitorServiceImpl(VisitorRepository visitorRepository) {
		
		this.visitorRepository = visitorRepository;
	}

	@Override
	 public Visitor saveVisitor(Visitor visitor ) {
	//	 staff.setCreateTime(LocalDateTime.now());
		 return visitorRepository.save(visitor);
	 }
	
	@Override
	public List<Visitor> findAllVisitors(){
		return (List<Visitor>) visitorRepository.findAll();
	}	
	
	@Override
	public Optional<Visitor> findOne(int id){
		return  visitorRepository.findById(id);
	}

	@Override
	public Visitor save(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Visitor saveVisitor(Visitor visitor, Staff staff_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
