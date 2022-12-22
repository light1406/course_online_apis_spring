package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.QuestionDto;
import com.tmdt.CourseOnline.entity.QuestionEntity;
import com.tmdt.CourseOnline.service.AnswerService;

public class QuestionMapper {
	
	@Autowired
	private AnswerService answerService;
	
	public QuestionDto mapEntityToDto(QuestionEntity questionEntity) {
		return new QuestionDto(
				questionEntity.getId(), 
				questionEntity.getQuestion(), 
				answerService.getDtoByQuestionId(questionEntity.getId()));
	}

	public List<QuestionDto> mapListEntityToListDto(List<QuestionEntity> questionEntities) {
		List<QuestionDto> questionDtos = new ArrayList<>();
		questionEntities.forEach(q -> {questionDtos.add(mapEntityToDto(q));});
		return questionDtos;
	}
}
