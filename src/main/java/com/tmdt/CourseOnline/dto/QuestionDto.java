package com.tmdt.CourseOnline.dto;

import java.util.List;

public class QuestionDto {
	private String id;
	private String question;
	private List<AnswerDto> answers;
	
	public QuestionDto() {}

	public QuestionDto(String id, String question, List<AnswerDto> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
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

	public List<AnswerDto> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerDto> answers) {
		this.answers = answers;
	}
}
