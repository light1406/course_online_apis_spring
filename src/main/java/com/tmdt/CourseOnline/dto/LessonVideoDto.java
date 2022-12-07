package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class LessonVideoDto extends ALesson {

	private String linkVideo;
	private long time;
	private List<CommentDto> comments;

	public LessonVideoDto() {
	}

	public LessonVideoDto(String id, String title, int serial, String description, Date manufacture, String linkVideo,
			long time, List<CommentDto> comments) {
		super(id, title, serial, description, manufacture);
		this.linkVideo = linkVideo;
		this.time = time;
		this.comments = comments;
	}

	public List<CommentDto> getComments() {
		return comments;
	}

	public void setComments(List<CommentDto> comments) {
		this.comments = comments;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
