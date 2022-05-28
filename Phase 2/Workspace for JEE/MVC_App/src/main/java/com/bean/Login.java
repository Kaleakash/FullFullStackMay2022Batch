package com.bean;

public class Login {
private String email;
private String password;
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
public Login(String email, String password) {
	super();						// it is use to call super class empty constructor 
	this.email = email;				// by default every java class extends Object. 
	this.password = password;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}

}
