package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.entity.AnswerEntity;
import com.tmdt.CourseOnline.reponsitory.AnswerRepository;
import com.tmdt.CourseOnline.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;
	
	@Override
	public void addListAnswer(List<AnswerEntity> answerEntities) {
		answerEntities.forEach(an -> {answerRepository.save(an);});
	}
	
	@Override
	public List<AnswerEntity> getAllEntityByQuestionId(String questionId){
		return answerRepository.getAllByQuestionId(questionId);
	}
}
