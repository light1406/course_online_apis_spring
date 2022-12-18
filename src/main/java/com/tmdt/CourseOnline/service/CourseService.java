package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.entity.CourseEntity;

public interface CourseService {

	List<CourseEntity> getAllCourseEntity();

	CourseEntity addCourse(CourseEntity courseEntity);

	void removeCourseEntityById(String id);

	void updateCourseEntity(CourseEntity courseEntity);

}
