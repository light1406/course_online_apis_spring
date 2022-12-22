package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.LessonQuestionDto;
import com.tmdt.CourseOnline.entity.LessonQuestionEntity;
import com.tmdt.CourseOnline.service.QuestionService;

@Component
public class LessonQuestionMapper {
	
	@Autowired
	private QuestionService questionService;
	
	public LessonQuestionDto mapEntityToDto(LessonQuestionEntity lessonQuestionEntity) {
		return new LessonQuestionDto(
				lessonQuestionEntity.getId(), 
				lessonQuestionEntity.getTitle(), 
				lessonQuestionEntity.getSerial(), 
				lessonQuestionEntity.getDescription(), 
				lessonQuestionEntity.getManufacture(), 
				questionService.getQuestionDtoByLqId(lessonQuestionEntity.getId()));
	}

	public List<LessonQuestionDto> mapListEntityToListDto(List<LessonQuestionEntity> lessonQuestionEntities) {
		List<LessonQuestionDto> lessonQuestionDtos = new ArrayList<>();
		lessonQuestionEntities.forEach(ls -> lessonQuestionDtos.add(mapEntityToDto(ls)));
		return lessonQuestionDtos;
	}
}
