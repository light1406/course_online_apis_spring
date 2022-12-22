package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.ChapterDto;
import com.tmdt.CourseOnline.entity.ChapterEntity;
import com.tmdt.CourseOnline.service.LessonQuestionService;
import com.tmdt.CourseOnline.service.LessonVideoService;

@Component
public class ChapterMapper {
	
	@Autowired
	private LessonQuestionService lessonQuestionService;
	
	@Autowired
	private LessonVideoService lessonVideoService;
	
	public ChapterDto mapEntityToDto(ChapterEntity chapterEntity) {
		return new ChapterDto(
				chapterEntity.getId(), 
				chapterEntity.getTitle(), 
				chapterEntity.getSerial(), 
				lessonVideoService.getLessonVideoDtoByChapterId(chapterEntity.getId()), 
				lessonQuestionService.getLessonVideoDtoByChapterId(chapterEntity.getId()));
	}

	public List<ChapterDto> mapListEntityToListDto(List<ChapterEntity> chapterEntities) {
		List<ChapterDto> chapterDtos = new ArrayList<>();
		chapterEntities.forEach(chap -> {chapterDtos.add(mapEntityToDto(chap));});
		return chapterDtos;
	}
}
