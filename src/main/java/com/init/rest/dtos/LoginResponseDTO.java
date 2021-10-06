package com.init.rest.dtos;

public class LoginResponseDTO {
	
	private String user;
	private String password;
	private String name;
	private String lastName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LoginResponseDTO(String user, String password, String name, String lastName) {
		this.user = user;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
