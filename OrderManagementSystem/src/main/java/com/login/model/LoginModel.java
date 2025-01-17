package com.login.model;

public class LoginModel {

	private long mobileNumber;
	private String email;
	private String password;
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginModel() {
		super();
	}
	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginModel(Long mobileNumber, String password) {
		super();
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [mobileNumber=" + mobileNumber + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
}
