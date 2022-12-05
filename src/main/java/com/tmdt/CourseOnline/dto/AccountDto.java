package com.tmdt.CourseOnline.dto;

public class AccountDto {

	private UserDto user;
	private String username;
	private String password;
	private String role;
	
	public AccountDto() {}

	public AccountDto(UserDto user, String username, String password, String role) {
		super();
		this.user = user;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
