package com.tmdt.CourseOnline.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity {

	@Id
	private String id;
	private String category;

	@OneToMany(mappedBy = "category")
	private List<CourseEntity> courses;

	public CategoryEntity() {}

	public CategoryEntity(String id, String category) {
		this.id = id;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
