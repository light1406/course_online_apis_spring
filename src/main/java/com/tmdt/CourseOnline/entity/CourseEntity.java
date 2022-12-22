package com.tmdt.CourseOnline.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class CourseEntity {

	@Id
	private String id;
	private String title;
	private double price;
	private String description;
	@Column(name = "corver_url")
	private String coverUrl;
	private Date manufacture;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;

	@OneToMany(mappedBy = "course")
	private List<BenefitEntity> benefits;

	@OneToMany(mappedBy = "course")
	private List<ChapterEntity> chapters;

	@ManyToMany(mappedBy = "coursesOfUser")
	private List<UserEntity> users;

	@ManyToMany(mappedBy = "courses")
	private List<OrderEntity> orders;

	@OneToMany(mappedBy = "course")
	private List<EvaluationEntity> evaluations;

	public CourseEntity() {
	}

	public CourseEntity(String id, String title, double price, String description, String coverUrl, Date manufacture,
			CategoryEntity category, List<BenefitEntity> benefits, List<ChapterEntity> chapters, List<UserEntity> users,
			List<OrderEntity> orders) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.coverUrl = coverUrl;
		this.manufacture = manufacture;
		this.category = category;
		this.benefits = benefits;
		this.chapters = chapters;
		this.users = users;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", coverUrl=" + coverUrl + ", manufacture=" + manufacture + ", category=" + category + ", benefits="
				+ benefits + ", chapters=" + chapters + ", users=" + users + ", orders=" + orders + ", evaluations="
				+ evaluations + "]";
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
}
