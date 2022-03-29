package com.termii.repository;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.termii.model.Staff;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	

}
