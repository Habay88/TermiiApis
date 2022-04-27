package com.termii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.termii.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
