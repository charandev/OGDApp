package com.mindtree.orchardappcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchardappcore.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//		Optional<User> findById(String mId);
}
