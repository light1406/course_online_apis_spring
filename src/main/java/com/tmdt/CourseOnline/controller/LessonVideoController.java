package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.LessonVideoEntity;
import com.tmdt.CourseOnline.service.LessonVideoService;

@RestController
@RequestMapping("/tmdt/lesson-video")
@CrossOrigin("*")
public class LessonVideoController {
	
	@Autowired
	private LessonVideoService lessonVideoService;
	
	@GetMapping("/get-all-entity")
	public List<LessonVideoEntity> getAllEntity(){
		return lessonVideoService.getAllEntity();
	}
	
	@PostMapping("/add")
	public void addLessonVideo(@RequestBody LessonVideoEntity lessonVideoEntity) {
		lessonVideoService.addLessonVideo(lessonVideoEntity);
	}
}
