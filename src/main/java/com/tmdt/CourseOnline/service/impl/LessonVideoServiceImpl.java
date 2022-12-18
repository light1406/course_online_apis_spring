package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.entity.LessonVideoEntity;
import com.tmdt.CourseOnline.reponsitory.LessonVideoRepository;
import com.tmdt.CourseOnline.service.LessonVideoService;

@Service
public class LessonVideoServiceImpl implements LessonVideoService {

	@Autowired
	private LessonVideoRepository lessonVideoRepository;

	@Override
	public void addLessonVideo(LessonVideoEntity lessonVideoEntity) {
		lessonVideoRepository.save(lessonVideoEntity);
	}

	@Override
	public List<LessonVideoEntity> getAllEntity() {
		return lessonVideoRepository.findAll();
	}

	@Override
	public List<LessonVideoEntity> getEntityByChapterid() {
		return null;
	}

	@Override
	public LessonVideoEntity getById(String lessonId) {
		return lessonVideoRepository.findById(lessonId).get();
	}
}
