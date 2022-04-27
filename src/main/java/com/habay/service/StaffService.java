package com.termii.service;

import java.util.List;
import java.util.Optional;

import com.termii.model.Staff;

public interface StaffService {

	Staff saveStaff(Staff staff);

	List<Staff> findAllStaff();

	Optional<Staff> findOne(int id);

	Staff save(Staff staff);

	

}
