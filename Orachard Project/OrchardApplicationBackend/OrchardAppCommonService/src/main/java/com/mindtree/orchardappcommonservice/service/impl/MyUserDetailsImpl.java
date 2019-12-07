package com.mindtree.orchardappcommonservice.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mindtree.orchardappcore.entity.User;

public class MyUserDetailsImpl implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mId;
	private String mindEmail;
	private String firstName;
	private String lastName;
	private String password;
	private String role;
	private String profilePicturePath;
	private boolean isActive;
	private List<GrantedAuthority> authorities;

	public MyUserDetailsImpl(User user) {
		this.mId = user.getmId();
		this.mindEmail = user.getMindEmail();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.password = user.getPassword();
		this.role = user.getRole();
		this.profilePicturePath = user.getProfilePicturePath();
		this.isActive = user.isActive();
		this.authorities = Arrays.stream(user.getRole().split(",")).map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return mId;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return isActive;
	}

	
}
