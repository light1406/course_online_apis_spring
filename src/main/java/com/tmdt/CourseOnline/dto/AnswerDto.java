package com.tmdt.CourseOnline.dto;

public class AnswerDto {
	private String key;
	private String value;
	private boolean isCorrect;

	public AnswerDto() {
	}

	public AnswerDto(String key, String value, boolean isCorrect) {
		super();
		this.key = key;
		this.value = value;
		this.isCorrect = isCorrect;
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
}
