package com.register.model;

public class RegisterModel {

	private int id;
	private String name;
	private String email;
	private String password;
	private long mobileNumber;
	private String resturantName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}
	public RegisterModel(int id, String name, String email, String password, long mobileNumber, String resturantName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.resturantName = resturantName;
	}
	public RegisterModel() {
		super();
	}
	public RegisterModel(String name, String email, String password, long mobileNumber, String resturantName) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.resturantName = resturantName;
	}
	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", resturantName=" + resturantName + "]";
	}
	
	
	
	
	
	
}
