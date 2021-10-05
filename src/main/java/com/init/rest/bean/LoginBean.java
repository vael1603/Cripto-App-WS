package com.init.rest.bean;

public class LoginBean {

	private boolean logged;
	private String  User;
	private boolean CorrectPassword;
	private boolean FoundUser;

	public boolean isLogged() {
		return logged;
	}
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public boolean isCorrectPassword() {
		return CorrectPassword;
	}
	public void setCorrectPassword(boolean correctPassword) {
		CorrectPassword = correctPassword;
	}
	public boolean isFoundUser() {
		return FoundUser;
	}
	public void setFoundUser(boolean foundUser) {
		FoundUser = foundUser;
	}

}
