package com.mindtree.orchardappcore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
	
@Entity
public class User {

	@Id
	private String mId;
	private String mindEmail;
	private String firstName;
	private String lastName;
	private String password;
	private String role;
	private String profilePicturePath;
	private boolean isActive;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String mId, String mindEmail, String firstName, String lastName, String password, String role,
			String profilePicturePath, boolean isActive) {
		super();
		this.mId = mId;
		this.mindEmail = mindEmail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.role = role;
		this.profilePicturePath = profilePicturePath;
		this.isActive = isActive;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getMindEmail() {
		return mindEmail;
	}
	public void setMindEmail(String mindEmail) {
		this.mindEmail = mindEmail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getProfilePicturePath() {
		return profilePicturePath;
	}
	public void setProfilePicturePath(String profilePicturePath) {
		this.profilePicturePath = profilePicturePath;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "User [mId=" + mId + ", mindEmail=" + mindEmail + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", role=" + role + ", profilePicturePath=" + profilePicturePath
				+ ", isActive=" + isActive + "]";
	}
	
	
	
	
}
