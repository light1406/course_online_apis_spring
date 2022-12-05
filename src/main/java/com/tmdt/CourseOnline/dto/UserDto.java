package com.tmdt.CourseOnline.dto;

import java.util.List;

public class UserDto {
	private String id;
	private String fname;
	private String avtUrl;
	private int age;
	private String email;
	private String phone;
	private List<CourseDto> registeredCourses;
	private List<LessonQuestionDto> learnedLessonQuestions;
	private List<LessonVideoDto> learnedLessonVideos;

	public UserDto() {
	}

	public UserDto(String id, String fname, String avtUrl, int age, String email, String phone,
			List<CourseDto> registeredCourses, List<LessonQuestionDto> learnedLessonQuestions,
			List<LessonVideoDto> learnedLessonVideos) {
		super();
		this.id = id;
		this.fname = fname;
		this.avtUrl = avtUrl;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.registeredCourses = registeredCourses;
		this.learnedLessonQuestions = learnedLessonQuestions;
		this.learnedLessonVideos = learnedLessonVideos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAvtUrl() {
		return avtUrl;
	}

	public void setAvtUrl(String avtUrl) {
		this.avtUrl = avtUrl;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<CourseDto> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(List<CourseDto> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	public List<LessonQuestionDto> getLearnedLessonQuestions() {
		return learnedLessonQuestions;
	}

	public void setLearnedLessonQuestions(List<LessonQuestionDto> learnedLessonQuestions) {
		this.learnedLessonQuestions = learnedLessonQuestions;
	}

	public List<LessonVideoDto> getLearnedLessonVideos() {
		return learnedLessonVideos;
	}

	public void setLearnedLessonVideos(List<LessonVideoDto> learnedLessonVideos) {
		this.learnedLessonVideos = learnedLessonVideos;
	}
}
