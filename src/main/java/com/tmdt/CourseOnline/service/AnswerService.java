package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.AnswerDto;
import com.tmdt.CourseOnline.entity.AnswerEntity;

public interface AnswerService {

	void addListAnswer(List<AnswerEntity> answerEntities);

	List<AnswerEntity> getAllEntityByQuestionId(String questionId);

	List<AnswerDto> getDtoByQuestionId(String questionId);

}
