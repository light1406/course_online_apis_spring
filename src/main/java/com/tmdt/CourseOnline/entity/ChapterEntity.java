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
@Table(name = "chapter")
public class ChapterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String title;
	private int serial;
	private Date manufacture;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseEntity course;

	@OneToMany(mappedBy = "chapter")
	private List<LessonQuestionEntity> lessonQuestions;

	@OneToMany(mappedBy = "chapter")
	private List<LessonVideoEntity> lessonVideos;

	public ChapterEntity(String title, int serial, Date manufacture) {
		super();
		this.title = title;
		this.serial = serial;
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

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}

	public List<LessonQuestionEntity> getLessonQuestions() {
		return lessonQuestions;
	}

	public void setLessonQuestions(List<LessonQuestionEntity> lessonQuestions) {
		this.lessonQuestions = lessonQuestions;
	}

	public List<LessonVideoEntity> getLessonVideos() {
		return lessonVideos;
	}

	public void setLessonVideos(List<LessonVideoEntity> lessonVideos) {
		this.lessonVideos = lessonVideos;
	}
}
