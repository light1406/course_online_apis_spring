package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.CourseDto;
import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.service.ChapterService;
import com.tmdt.CourseOnline.service.EvaluationService;
import com.tmdt.CourseOnline.service.impl.ChapterServiceImpl;

@Component
public class CourseMapper {
	
	@Autowired
	private EvaluationService evaluationService;
	
	@Autowired
	private ChapterService chapterService;
	
	public CourseDto mapEntityToDto(CourseEntity courseEntity) {
		List<String> benefits = new ArrayList<>();
		return new CourseDto(
				courseEntity.getId(), 
				courseEntity.getTitle(), 
				courseEntity.getCategory().getCategory(),
				courseEntity.getDescription(),
				courseEntity.getCoverUrl(),
				benefits, 
				chapterService.getChapterDtoByCourseId(courseEntity.getId()),
				courseEntity.getPrice(), courseEntity.getManufacture(),
				evaluationService.getEvaluationDtoByCourseId(courseEntity.getId()));
	}

	public List<CourseDto> mapListEntityToListDto(List<CourseEntity> courseEntities) {
		List<CourseDto> courseDtos = new ArrayList<>();
		courseEntities.forEach(c -> {
			courseDtos.add(mapEntityToDto(c));
		});
		return courseDtos;
	}
}
