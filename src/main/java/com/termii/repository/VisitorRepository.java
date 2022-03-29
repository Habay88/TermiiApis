package com.termii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.termii.model.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer> {

}
