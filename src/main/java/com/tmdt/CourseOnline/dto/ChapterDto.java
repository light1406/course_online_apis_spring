package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class ChapterDto {

	private String id;
	private String title;
	private int serial;
	private List<LessonVideoDto> lessonVideos;
	private List<LessonQuestionDto> lessonQuestions;
	private Date manufacture;

	public ChapterDto() {
	}

	public ChapterDto(String id, String title, int serial, List<LessonVideoDto> lessonVideos,
			List<LessonQuestionDto> lessonQuestions, Date manufacture) {
		super();
		this.id = id;
		this.title = title;
		this.serial = serial;
		this.lessonVideos = lessonVideos;
		this.lessonQuestions = lessonQuestions;
		this.manufacture = manufacture;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public List<LessonVideoDto> getLessonVideos() {
		return lessonVideos;
	}

	public void setLessonVideos(List<LessonVideoDto> lessonVideos) {
		this.lessonVideos = lessonVideos;
	}

	public List<LessonQuestionDto> getLessonQuestions() {
		return lessonQuestions;
	}

	public void setLessonQuestions(List<LessonQuestionDto> lessonQuestions) {
		this.lessonQuestions = lessonQuestions;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
}
