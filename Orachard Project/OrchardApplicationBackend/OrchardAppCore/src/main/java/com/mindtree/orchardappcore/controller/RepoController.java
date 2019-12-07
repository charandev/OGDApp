package com.mindtree.orchardappcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.orchardappcore.repository.UserRepository;

public class RepoController {

	@Autowired
	UserRepository userRepository;
}
