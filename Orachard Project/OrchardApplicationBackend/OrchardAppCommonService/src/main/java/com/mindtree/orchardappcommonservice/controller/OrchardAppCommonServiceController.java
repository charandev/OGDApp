package com.mindtree.orchardappcommonservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orchardappcommonservice.service.UserRegistrationService;
import com.mindtree.orchardappcore.entity.User;


@RestController
public class OrchardAppCommonServiceController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	
	@PostMapping("/signup")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		user=userRegistrationService.signUp(user);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping("/checkmid")
	public ResponseEntity<User> checkMid(@RequestParam String mId) {
		User user=userRegistrationService.checkMid(mId);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	
//	@PostMapping("/signin")
//	public ResponseEntity<User> signIn(@RequestBody User user )
//	{
//		User user=userRegistrationService
//		return ResponseEntity.status(HttpStatus.OK).body(user);
//	}
	
	
	
	@GetMapping("/get")
	public String get() {
		return "hgfd";
	}
//	@PostMapping("/registeradmin")
//	public User registerAdmin(@RequestBody User user) {
//		System.out.println(user);
//		return user;
//	}

	
}
