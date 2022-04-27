package com.termii.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.termii.model.Staff;
import com.termii.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffRepository staffrepo;
//	
//	@Autowired
//	PasswordEncoder passwordEncoder;
	
		public StaffServiceImpl(StaffRepository staffrepo) {
				
				this.staffrepo = staffrepo;
			}

		@Override
		 public Staff saveStaff(Staff staff) {
		//	 staff.setCreateTime(LocalDateTime.now());
			 return staffrepo.save(staff);
		 }
		
		@Override
	public List<Staff> findAllStaff(){
		return (List<Staff>) staffrepo.findAll();
	}	
		
		@Override
		public Optional<Staff> findOne(int id){
			return  staffrepo.findById(id);
		}

		@Override
		public Staff save(Staff staff) {
			// TODO Auto-generated method stub
			return null;
		}

}


