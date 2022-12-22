package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.LessonVideoDto;
import com.tmdt.CourseOnline.entity.LessonVideoEntity;

public interface LessonVideoService {

	LessonVideoDto getById(String lessonId);

	List<LessonVideoEntity> getEntityByChapterid(String id);

	List<LessonVideoEntity> getAllEntity();

	void addLessonVideo(LessonVideoEntity lessonVideoEntity);

	List<LessonVideoDto> getLessonVideoDtoByChapterId(String chapterId);

}
