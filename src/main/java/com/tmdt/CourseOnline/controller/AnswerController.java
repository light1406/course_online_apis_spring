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

import com.tmdt.CourseOnline.entity.AnswerEntity;
import com.tmdt.CourseOnline.service.AnswerService;

@RestController
@RequestMapping("/tmdt/answer")
@CrossOrigin("*")
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;

	@PostMapping("/add-list")
	public void addListAnswer(@RequestBody List<AnswerEntity> answerEntities) {
		answerService.addListAnswer(answerEntities);
	}
	
	@GetMapping("/get-entity-by-question-id")
	public List<AnswerEntity> getEntityByQuestionId(@RequestParam String questionId){
		return answerService.getAllEntityByQuestionId(questionId);
	}
}
