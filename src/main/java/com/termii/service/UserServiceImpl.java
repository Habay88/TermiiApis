package com.termii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.termii.model.Staff;
import com.termii.model.User;
import com.termii.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepository userrepo;

	public UserServiceImpl(UserRepository userrepo) {
		
		this.userrepo = userrepo;
	}
	
	@Override
	 public User signUp(User user) {

		 return userrepo.save(user);
	 }
	
}
