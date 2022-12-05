package com.tmdt.CourseOnline.dto;

import java.util.Date;

public abstract class ALesson {
	protected String id;
	protected String title;
	protected int serial;
	protected String description;
	protected Date manufacture;

	public ALesson() {}
	
	public ALesson(String id, String title, int serial, String description, Date manufacture) {
		super();
		this.id = id;
		this.title = title;
		this.serial = serial;
		this.description = description;
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

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
}
