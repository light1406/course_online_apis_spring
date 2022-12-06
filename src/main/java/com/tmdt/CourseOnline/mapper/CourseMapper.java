package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.CourseDto;
import com.tmdt.CourseOnline.entity.CourseEntity;

public class CourseMapper {
	
	@Autowired
	private ChapterMapper chapterMapper;
	
	public CourseDto mapEntityToDto(CourseEntity courseEntity) {
		List<String> benefits = new ArrayList<>();
		courseEntity.getBenefits().forEach(b -> {benefits.add(b.getDescription());});
		return new CourseDto(
				courseEntity.getId(), 
				courseEntity.getTitle(), 
				courseEntity.getCategory().getCategory(), 
				benefits, 
				chapterMapper.mapListEntityToListDto(courseEntity.getChapters()), 
				courseEntity.getPrice(), 
				courseEntity.getManufacture());
	}

	public List<CourseDto> mapListEntityToListDto(List<CourseEntity> courseEntities) {
		List<CourseDto> courseDtos = new ArrayList<>();
		courseEntities.forEach(c -> {courseDtos.add(mapEntityToDto(c));});
		return courseDtos;
	}
}
