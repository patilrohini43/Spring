package com.bridgelabz.model;

public class User {
	
	private String username;
	private String email;
	private String password;
	private String confirmpass;
	
	
	
	
	public User()
	{
		
	}
	
	public User(String username,String email,String password,String confirmpass)
	{
		this.username=username;
		this.email=email;
		this.password=password;
		this.confirmpass=confirmpass;
		
	}
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	
	
	
	
	

}
