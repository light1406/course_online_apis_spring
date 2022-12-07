package com.tmdt.CourseOnline.dto;

import java.util.Date;

public class EvaluationDto {
	private String id;
	private int score;
	private String comment;
	private Date time;
	private UserDto user;

	public EvaluationDto(String id, int score, String comment, Date time, UserDto user) {
		super();
		this.id = id;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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
