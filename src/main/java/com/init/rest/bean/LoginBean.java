package com.init.rest.bean;

public class LoginBean {

	private boolean logged;
	private String  user;
	private boolean correctPassword;
	private boolean foundUser;
	private String 	name;
	private String 	lastName;

	public boolean isLogged() {
		return logged;
	}
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public boolean isCorrectPassword() {
		return correctPassword;
	}
	public void setCorrectPassword(boolean correctPassword) {
		this.correctPassword = correctPassword;
	}
	public boolean isFoundUser() {
		return foundUser;
	}
	public void setFoundUser(boolean foundUser) {
		this.foundUser = foundUser;
	}
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

}
