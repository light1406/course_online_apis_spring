package com.tmdt.CourseOnline.dto;

import java.util.Date;

public class ReplyDto {
	private String id;
	private String comment;
	private Date time;
	private UserDto user;

	public ReplyDto() {
	}

	public ReplyDto(String id, String comment, Date time, UserDto user) {
		super();
		this.id = id;
		this.comment = comment;
		this.time = time;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}
}
