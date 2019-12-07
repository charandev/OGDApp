package com.mindtree.orchardappcommonservice.service;

import com.mindtree.orchardappcore.entity.User;

public interface UserRegistrationService {

	User signUp(User user);

	User checkMid(String mId);

}
