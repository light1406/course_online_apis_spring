package com.tmdt.CourseOnline.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String fname;
	@Column(name="avtURL")
	private String avtUrl;
	private int age;
	private String email;
	private String phone;

	@OneToOne(mappedBy = "user")
	private AccountEntity account;

	@ManyToMany
	@JoinTable(name = "course_of_user"
			, joinColumns = @JoinColumn(name = "user_id")
			, inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<CourseEntity> coursesOfUser;
	
	@ManyToMany
	@JoinTable(name = "learned_lesson_question"
			, joinColumns = @JoinColumn(name = "user_id")
			, inverseJoinColumns = @JoinColumn(name = "lesson_question_id"))
	private List<LessonQuestionEntity> learnedLessonQuestions;
	
	@ManyToMany
	@JoinTable(name = "learned_lesson_video"
			, joinColumns = @JoinColumn(name = "user_id")
			, inverseJoinColumns = @JoinColumn(name = "lesson_video_id"))
	private List<LessonVideoEntity> learnedLessonVideos;
	
	@OneToMany(mappedBy = "user")
	private List<OrderEntity> orders; 
	
	@OneToMany(mappedBy = "user")
	private List<EvaluationEntity> evaluations;
	
	@OneToMany(mappedBy = "user")
	private List<CommentEntity> comments;
	
	public UserEntity() {}
	
	public UserEntity(String fname, String avtUrl, int age, String email, String phone) {
		this.fname = fname;
		this.avtUrl = avtUrl;
		this.age = age;
		this.email = email;
		this.phone = phone;
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

	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}

	public List<CourseEntity> getCoursesOfUser() {
		return coursesOfUser;
	}

	public void setCoursesOfUser(List<CourseEntity> coursesOfUser) {
		this.coursesOfUser = coursesOfUser;
	}

	public List<LessonQuestionEntity> getLearnedLessonQuestions() {
		return learnedLessonQuestions;
	}

	public void setLearnedLessonQuestions(List<LessonQuestionEntity> learnedLessonQuestions) {
		this.learnedLessonQuestions = learnedLessonQuestions;
	}

	public List<LessonVideoEntity> getLearnedLessonVideos() {
		return learnedLessonVideos;
	}

	public void setLearnedLessonVideos(List<LessonVideoEntity> learnedLessonVideos) {
		this.learnedLessonVideos = learnedLessonVideos;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public List<EvaluationEntity> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<EvaluationEntity> evaluations) {
		this.evaluations = evaluations;
	}

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}
}
