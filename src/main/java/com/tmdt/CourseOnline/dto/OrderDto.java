package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class OrderDto {
	private String id;
	private UserDto user;
	private List<CourseDto> courses;
	private String status;
	private Date purchaseDate;
	
	public OrderDto() {}

	public OrderDto(String id, UserDto user, List<CourseDto> courses, String status, Date purchaseDate) {
		super();
		this.id = id;
		this.user = user;
		this.courses = courses;
		this.status = status;
		this.purchaseDate = purchaseDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<CourseDto> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseDto> courses) {
		this.courses = courses;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public double getTotalPrice() {
		double total = 0;
		for (CourseDto course: courses) {
			total += course.getPrice();
		}
		return total;
	}
}
