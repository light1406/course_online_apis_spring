package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.entity.QuestionEntity;

public interface QuestionService {

	void addListQuestion(List<QuestionEntity> questionEntities);

	List<QuestionEntity> getAllEntityByLQId(String lqId);

}
