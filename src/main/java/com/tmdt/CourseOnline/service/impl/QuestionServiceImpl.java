package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.QuestionDto;
import com.tmdt.CourseOnline.entity.QuestionEntity;
import com.tmdt.CourseOnline.mapper.QuestionMapper;
import com.tmdt.CourseOnline.reponsitory.QuestionRepository;
import com.tmdt.CourseOnline.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;
	
	private QuestionMapper questionMapper = new QuestionMapper();
	
	@Override
	public List<QuestionDto> getQuestionDtoByLqId(String id){
		return questionMapper.mapListEntityToListDto(questionRepository.getAllByLQId(id));
	}
	
	@Override
	public void addListQuestion(List<QuestionEntity> questionEntities) {
		questionEntities.forEach(q -> {
			questionRepository.save(q);
		});
	}
	
	
	@Override
	public List<QuestionEntity> getAllEntityByLQId(String lqId){
		return questionRepository.getAllByLQId(lqId);
	}
}
