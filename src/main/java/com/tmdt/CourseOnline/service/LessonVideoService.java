package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.entity.LessonVideoEntity;

public interface LessonVideoService {

	LessonVideoEntity getById(String lessonId);

	List<LessonVideoEntity> getEntityByChapterid();

	List<LessonVideoEntity> getAllEntity();

	void addLessonVideo(LessonVideoEntity lessonVideoEntity);

}
