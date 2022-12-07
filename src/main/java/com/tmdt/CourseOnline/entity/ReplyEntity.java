package com.tmdt.CourseOnline.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reply")
public class ReplyEntity {
	private String id;
	private String comment;
	private Date time;

	@ManyToOne
	@JoinColumn(name = "comment_id")
	private CommentEntity commentForReply;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public ReplyEntity(String id, String comment, Date time, CommentEntity commentForReply, UserEntity user) {
		super();
		this.id = id;
		this.comment = comment;
		this.time = time;
		this.commentForReply = commentForReply;
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

	public CommentEntity getCommentForReply() {
		return commentForReply;
	}

	public void setCommentForReply(CommentEntity commentForReply) {
		this.commentForReply = commentForReply;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}
