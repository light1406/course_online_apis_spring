package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.QuestionDto;
import com.tmdt.CourseOnline.entity.QuestionEntity;

public interface QuestionService {

	void addListQuestion(List<QuestionEntity> questionEntities);

	List<QuestionEntity> getAllEntityByLQId(String lqId);

	List<QuestionDto> getQuestionDtoByLqId(String id);

}
