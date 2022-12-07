package com.tmdt.CourseOnline.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String comment;
	private Date time;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "lesson_video_id")
	private LessonVideoEntity lessonVideo;

	@OneToMany(mappedBy = "commentForReply")
	private List<ReplyEntity> replies;

	public CommentEntity(String id, String comment, Date time, UserEntity user, LessonVideoEntity lessonVideo) {
		super();
		this.id = id;
		this.comment = comment;
		this.time = time;
		this.user = user;
		this.lessonVideo = lessonVideo;
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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public LessonVideoEntity getLessonVideo() {
		return lessonVideo;
	}

	public List<ReplyEntity> getReplies() {
		return replies;
	}

	public void setReplies(List<ReplyEntity> replies) {
		this.replies = replies;
	}

	public void setLessonVideo(LessonVideoEntity lessonVideo) {
		this.lessonVideo = lessonVideo;
	}
}
