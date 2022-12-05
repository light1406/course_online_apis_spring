package com.tmdt.CourseOnline.dto;

import java.util.Date;
import java.util.List;

public class CourseDto {
	private String id;
	private String title;
	private String category;
	private List<String> benefit;
	private List<ChapterDto> chapters;
	private double price;
	private Date manufacture;

	public CourseDto() {
	}

	public CourseDto(String id, String title, String category, List<String> benefit, List<ChapterDto> chapters,
			double price, Date manufacture) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.benefit = benefit;
		this.chapters = chapters;
		this.price = price;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getBenefit() {
		return benefit;
	}

	public void setBenefit(List<String> benefit) {
		this.benefit = benefit;
	}

	public List<ChapterDto> getChapters() {
		return chapters;
	}

	public void setChapters(List<ChapterDto> chapters) {
		this.chapters = chapters;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
}
