package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class LessonQuestionDto extends ALesson{

	private List<QuestionDto> questions;
	
	public LessonQuestionDto() {}

	public LessonQuestionDto(String id, String title, int serial, String description, Date manufacture,
			List<QuestionDto> questions) {
		super(id, title, serial, description, manufacture);
		this.questions = questions;
	}

	public List<QuestionDto> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionDto> questions) {
		this.questions = questions;
	}
}
