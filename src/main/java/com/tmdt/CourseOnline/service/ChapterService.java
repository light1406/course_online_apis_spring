package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.ChapterDto;
import com.tmdt.CourseOnline.entity.ChapterEntity;

public interface ChapterService {

	void deleteChapter(String id);

	void updateChapter(ChapterEntity chapterEntity);

	void addChapter(ChapterEntity chapterEntity);

	List<ChapterEntity> getEntityByCourseId(String courseId);

	List<ChapterEntity> getAllEntity();

	ChapterEntity getEntityById(String id);

	List<ChapterDto> getChapterDtoByCourseId(String courseId);

}
