package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class CommentDto {
	private String id;
	private String comment;
	private Date time;
	private UserDto user;
	private List<CommentDto> replies;

	public CommentDto() {
	}

	public CommentDto(String id, String comment, Date time, UserDto user, List<CommentDto> replies) {
		super();
		this.id = id;
		this.comment = comment;
		this.time = time;
		this.user = user;
		this.replies = replies;
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

	public List<CommentDto> getReplies() {
		return replies;
	}

	public void setReplies(List<CommentDto> replies) {
		this.replies = replies;
	}
}
