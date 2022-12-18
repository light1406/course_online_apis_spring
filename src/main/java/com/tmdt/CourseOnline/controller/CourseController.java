package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.service.CourseService;

@RestController
@RequestMapping("/tmdt/course")
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add")
	public CourseEntity addCourse(@RequestBody CourseEntity courseEntity) {
		return courseService.addCourse(courseEntity);
	}
	
	@GetMapping("/get-all-admin")
	public  List<CourseEntity> getAllAdmin() {
		return courseService.getAllCourseEntity();
	}
	
	@PutMapping("/update")
	public void updateCourse(@RequestBody CourseEntity courseEntity) {
		courseService.updateCourseEntity(courseEntity);
	}
	
	@DeleteMapping("/delete")
	public void deleteCourse(@RequestParam String id) {
		courseService.removeCourseEntityById(id);
	}
}
