package com.javatpoint;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name,password,email;

public void validate() {
	if(name.length()<1)
		addFieldError("name","Name can't be blank");
	if(password.length()<6)
		addFieldError("password","Password must be greater than 5");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String execute(){
	return "success";
}
}
