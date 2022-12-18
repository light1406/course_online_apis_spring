package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.QuestionDto;
import com.tmdt.CourseOnline.entity.QuestionEntity;

public class QuestionMapper {
	
	@Autowired
	private AnswerMapper answerMapper;
	
//	public QuestionDto mapEntityToDto(QuestionEntity questionEntity) {
//		return new QuestionDto(
//				questionEntity.getId(), 
//				questionEntity.getQuestion(), 
//				answerMapper.mapListEntityToListDto(questionEntity.getAnswers()));
//	}
//
//	public List<QuestionDto> mapListEntityToListDto(List<QuestionEntity> questionEntities) {
//		List<QuestionDto> questionDtos = new ArrayList<>();
//		questionEntities.forEach(q -> {questionDtos.add(mapEntityToDto(q));});
//		return questionDtos;
//	}
}
