package com.tmdt.CourseOnline.entity;

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
@Table(name = "question")
public class QuestionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String question;

	@ManyToOne
	@JoinColumn(name = "lesson_question_id")
	private LessonQuestionEntity lessonQuestion;

	@OneToMany(mappedBy = "question")
	private List<AnswerEntity> answers;

	public QuestionEntity(String question) {
		super();
		this.question = question;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public LessonQuestionEntity getLessonQuestion() {
		return lessonQuestion;
	}

	public void setLessonQuestion(LessonQuestionEntity lessonQuestion) {
		this.lessonQuestion = lessonQuestion;
	}

	public List<AnswerEntity> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerEntity> answers) {
		this.answers = answers;
	}
}
