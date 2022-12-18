package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.ChapterDto;
import com.tmdt.CourseOnline.entity.ChapterEntity;

public class ChapterMapper {
	@Autowired
	private LessonQuestionMapper lessonQuestionMapper;
	
	@Autowired
	private LessonVideoMapper lessonVideoMapper;
	
//	public ChapterDto mapEntityToDto(ChapterEntity chapterEntity) {
//		return new ChapterDto(
//				chapterEntity.getId(), 
//				chapterEntity.getTitle(), 
//				chapterEntity.getSerial(), 
//				lessonVideoMapper.mapListEntityToListDto(chapterEntity.getLessonVideos()), 
//				lessonQuestionMapper.mapListEntityToListDto(chapterEntity.getLessonQuestions()));
//	}
//
//	public List<ChapterDto> mapListEntityToListDto(List<ChapterEntity> chapterEntities) {
//		List<ChapterDto> chapterDtos = new ArrayList<>();
//		chapterEntities.forEach(chap -> {chapterDtos.add(mapEntityToDto(chap));});
//		return chapterDtos;
//	}
}
