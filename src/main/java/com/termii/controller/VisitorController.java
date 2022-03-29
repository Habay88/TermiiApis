package com.termii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.termii.model.Visitor;
import com.termii.service.VisitorService;

@RestController
@RequestMapping("visitor")
public class VisitorController {

	@Autowired
	VisitorService visitorService;
	
	 @PostMapping 
	    public ResponseEntity<?> savePurchase(@RequestBody Visitor visitor)
	    {
	        return new ResponseEntity<>(visitorService.saveVisitor(visitor), HttpStatus.CREATED);
	    }
	 
	 @GetMapping("{id}")
	    public ResponseEntity<?> getVisitorById(@PathVariable int id)
	    {
	        return ResponseEntity.ok(visitorService.findOne(id));
	    }
	 @GetMapping
	    public ResponseEntity<?> getAllStaff()
	    {
	        return ResponseEntity.ok(visitorService.findAllVisitors());
	    }
}
