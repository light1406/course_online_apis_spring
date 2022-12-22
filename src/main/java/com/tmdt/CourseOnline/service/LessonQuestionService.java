package com.tmdt.CourseOnline.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.tmdt.CourseOnline.dto.LessonQuestionDto;
import com.tmdt.CourseOnline.entity.LessonQuestionEntity;

public interface LessonQuestionService {

	void addLessonQuestion(@RequestBody LessonQuestionEntity lessonQuestionEntity);

	LessonQuestionEntity getLessonQuesionEntityById(String id);

	List<LessonQuestionEntity> getAllByChapterId(String chapterId);

	List<LessonQuestionEntity> getAll();

	List<LessonQuestionDto> getLessonVideoDtoByChapterId(String chapterId);

}
