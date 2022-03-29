package com.termii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.termii.model.VisitorLog;

@Repository
public interface VisitorLogRepository extends JpaRepository<VisitorLog, Integer> {

}
