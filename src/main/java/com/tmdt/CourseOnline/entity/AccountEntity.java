package com.tmdt.CourseOnline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {
	@Id
	private String username;
	private String password;
	private int role;

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public AccountEntity() {
	}

	public AccountEntity(String username, String password, int role, UserEntity user) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}
