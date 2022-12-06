package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import com.tmdt.CourseOnline.dto.LessonVideoDto;
import com.tmdt.CourseOnline.entity.LessonVideoEntity;

public class LessonVideoMapper {
	public LessonVideoDto mapEntityToDto(LessonVideoEntity lessonVideoEntity) {
		return new LessonVideoDto(
				lessonVideoEntity.getId(), 
				lessonVideoEntity.getTitle(), 
				lessonVideoEntity.getSerial(), 
				lessonVideoEntity.getDescription(), 
				lessonVideoEntity.getManufacture(), 
				lessonVideoEntity.getLinkVideo(), 
				lessonVideoEntity.getTime());
	}

	public List<LessonVideoDto> mapListEntityToListDto(List<LessonVideoEntity> lessonVideoEntities) {
		List<LessonVideoDto> lessonVideoDtos = new ArrayList<>();
		lessonVideoEntities.forEach(ls -> {lessonVideoDtos.add(mapEntityToDto(ls));});
		return lessonVideoDtos;
	}
}
