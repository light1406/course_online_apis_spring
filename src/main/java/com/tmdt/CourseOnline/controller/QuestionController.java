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

import com.tmdt.CourseOnline.entity.QuestionEntity;
import com.tmdt.CourseOnline.service.QuestionService;

@RestController
@RequestMapping("/tmdt/question")
@CrossOrigin("*")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/add-list")
	public void addLisQuestion(@RequestBody List<QuestionEntity> questionEntities) {
		questionService.addListQuestion(questionEntities);
	}
	
	@GetMapping("/get-all-by-lq-id")
	public List<QuestionEntity> getQuestionsByLessonQuestionId(@RequestParam String lessonQuestionId){
		return questionService.getAllEntityByLQId(lessonQuestionId);
	}
}
