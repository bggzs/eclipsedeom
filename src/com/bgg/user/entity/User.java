package com.bgg.user.entity;

public class User {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	public User() {}
	public User(String account, String password) {
		this.account=account;
		this.password=password;
	}
}