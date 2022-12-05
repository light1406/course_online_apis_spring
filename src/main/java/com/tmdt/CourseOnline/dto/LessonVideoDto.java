package com.tmdt.CourseOnline.dto;

import java.util.Date;

public class LessonVideoDto extends ALesson{

	private String linkVideo;
	private long time;
	
	public LessonVideoDto() {}

	public LessonVideoDto(String id, String title, int serial, String description, Date manufacture, String linkVideo, long time) {
		super(id, title, serial, description, manufacture);
		this.linkVideo = linkVideo;
		this.time = time;
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
