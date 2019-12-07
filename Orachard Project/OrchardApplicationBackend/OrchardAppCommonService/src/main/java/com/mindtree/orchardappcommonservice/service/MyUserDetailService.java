package com.mindtree.orchardappcommonservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mindtree.orchardappcommonservice.service.impl.MyUserDetailsImpl;
import com.mindtree.orchardappcore.entity.User;
import com.mindtree.orchardappcore.repository.UserRepository;

public class MyUserDetailService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	public UserDetails loadUserByUsername(String mId) throws UsernameNotFoundException {
		Optional<User> user  = userRepository.findById(mId); 
		user.orElseThrow(()->new UsernameNotFoundException("The MID "+ mId+" does not exist"));
		
		return user.map(MyUserDetailsImpl::new).get();
		
	}

}
