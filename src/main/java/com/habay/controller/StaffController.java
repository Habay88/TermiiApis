package com.termii.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.termii.model.Staff;
import com.termii.model.Status;
import com.termii.model.User;
import com.termii.repository.StaffRepository;
import com.termii.service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@Autowired
	private StaffRepository staffrepo;
	
	 @PostMapping 
	    public ResponseEntity<?> savePurchase(@RequestBody Staff staff)
	    {
	        return new ResponseEntity<>(staffService.saveStaff(staff), HttpStatus.CREATED);
	    }
	 
	 
	 
	    @GetMapping("{id}")
	    public ResponseEntity<?> getStaffById(@PathVariable int id)
	    {
	        return ResponseEntity.ok(staffService.findOne(id));
	    }
	    
	    @GetMapping
	    public ResponseEntity<?> getAllStaff()
	    {
	        return ResponseEntity.ok(staffService.findAllStaff());
	    }
}
