package com.tmdt.CourseOnline.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "lesson_question")
public class LessonQuestionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String title;
	private int serial;
	private String description;
	private Date manufacture;
	
	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private ChapterEntity chapter;
	
	@OneToMany(mappedBy = "lessonQuestion")
	private List<QuestionEntity> questions;
	
	@ManyToMany(mappedBy = "learnedLessonQuestions")
	private List<UserEntity> users;

	public LessonQuestionEntity(String title, int serial, String description, Date manufacture) {
		super();
		this.title = title;
		this.serial = serial;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}

	public ChapterEntity getChapter() {
		return chapter;
	}

	public void setChapter(ChapterEntity chapter) {
		this.chapter = chapter;
	}

	public List<QuestionEntity> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionEntity> questions) {
		this.questions = questions;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
}
