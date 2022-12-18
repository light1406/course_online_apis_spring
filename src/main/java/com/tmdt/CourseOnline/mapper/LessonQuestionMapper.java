package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.LessonQuestionDto;
import com.tmdt.CourseOnline.entity.LessonQuestionEntity;

public class LessonQuestionMapper {
	
	@Autowired
	private QuestionMapper questionMapper;
	
//	public LessonQuestionDto mapEntityToDto(LessonQuestionEntity lessonQuestionEntity) {
//		return new LessonQuestionDto(
//				lessonQuestionEntity.getId(), 
//				lessonQuestionEntity.getTitle(), 
//				lessonQuestionEntity.getSerial(), 
//				lessonQuestionEntity.getDescription(), 
//				lessonQuestionEntity.getManufacture(), 
//				questionMapper.mapListEntityToListDto(lessonQuestionEntity.getQuestions()));
//	}
//
//	public List<LessonQuestionDto> mapListEntityToListDto(List<LessonQuestionEntity> lessonQuestionEntities) {
//		List<LessonQuestionDto> lessonQuestionDtos = new ArrayList<>();
//		lessonQuestionEntities.forEach(ls -> lessonQuestionDtos.add(mapEntityToDto(ls)));
//		return lessonQuestionDtos;
//	}
}
