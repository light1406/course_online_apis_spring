package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.LessonQuestionEntity;
import com.tmdt.CourseOnline.service.LessonQuestionService;

@RestController
@RequestMapping("/tmdt/leson-question")
@CrossOrigin("*")
public class LessonQuestionController {
	
	@Autowired
	private LessonQuestionService lessonQuestionService;
	
	@PostMapping("/add")
	public void addLessonQuestion(@RequestBody LessonQuestionEntity lessonQuestionEntity) {
		lessonQuestionService.addLessonQuestion(lessonQuestionEntity);
	}
	
	@GetMapping("/get-all")
	public List<LessonQuestionEntity> getAllEntity(){
		return lessonQuestionService.getAll();
	}
	
	@GetMapping("/get-entity-by-chapter-id")
	public List<LessonQuestionEntity> getAllEntityByChapterId(@RequestParam String chapterId){
		return lessonQuestionService.getAllByChapterId(chapterId);
	}
	
	@GetMapping("/get-entity-by-id")
	public LessonQuestionEntity getEntityById(@RequestParam String id) {
		return lessonQuestionService.getLessonQuesionEntityById(id);
	}
}
