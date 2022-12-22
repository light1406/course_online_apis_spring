package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.LessonVideoDto;
import com.tmdt.CourseOnline.entity.LessonVideoEntity;
import com.tmdt.CourseOnline.service.CommentService;

@Component
public class LessonVideoMapper {
	
	@Autowired
	private CommentService commentService;
	
	public LessonVideoDto mapEntityToDto(LessonVideoEntity lessonVideoEntity) {
		return new LessonVideoDto(
				lessonVideoEntity.getId(), 
				lessonVideoEntity.getTitle(), 
				lessonVideoEntity.getSerial(), 
				lessonVideoEntity.getDescription(), 
				lessonVideoEntity.getManufacture(), 
				lessonVideoEntity.getLinkVideo(), 
				lessonVideoEntity.getTime(),
				commentService.getCommentDtoByLvdId(lessonVideoEntity.getId()));
	}

	public List<LessonVideoDto> mapListEntityToListDto(List<LessonVideoEntity> lessonVideoEntities) {
		List<LessonVideoDto> lessonVideoDtos = new ArrayList<>();
		lessonVideoEntities.forEach(ls -> {lessonVideoDtos.add(mapEntityToDto(ls));});
		return lessonVideoDtos;
	}
}
