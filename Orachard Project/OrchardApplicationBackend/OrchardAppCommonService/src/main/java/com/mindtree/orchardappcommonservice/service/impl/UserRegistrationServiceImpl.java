package com.mindtree.orchardappcommonservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mindtree.orchardappcommonservice.service.UserRegistrationService;
import com.mindtree.orchardappcore.entity.User;
import com.mindtree.orchardappcore.repository.UserRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	UserRepository userRepository;

	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public UserRegistrationServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {

		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public User signUp(User user) {
		try {
			
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setActive(true);
			return userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User checkMid(String mId) {
		try {
			if (userRepository.existsById(mId)) {
				User user =userRepository.findById(mId).get();
				return user;
			}
			else {
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
