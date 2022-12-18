package com.tmdt.CourseOnline.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class AnswerEntity {
	@Id
	private String id;
	@Column(name="`key`")
	private String key;
	private String value;
	@Column(name = "is_correct")
	private boolean isCorrect;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private QuestionEntity question;

	public AnswerEntity() {}

	public AnswerEntity(String id, String key, String value, boolean isCorrect, QuestionEntity question) {
		super();
		this.id = id;
		this.key = key;
		this.value = value;
		this.isCorrect = isCorrect;
		this.question = question;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public QuestionEntity getQuestion() {
		return question;
	}

	public void setQuestion(QuestionEntity question) {
		this.question = question;
	}
}
