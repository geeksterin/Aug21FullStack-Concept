package com.geekster.sept21;

public class Users {

	private int userId;
	private String userName;
	private String firstname;
	private String lastName;
	
	
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setFistName(String firstName) {
		this.firstname = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
}
