package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.CourseDto;
import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.mapper.CourseMapper;
import com.tmdt.CourseOnline.reponsitory.CourseRepository;
import com.tmdt.CourseOnline.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private CourseMapper courseMapper;

	@Override
	public CourseDto getCourseDetail(String id) {
		return courseMapper.mapEntityToDto(courseRepository.findById(id).get());
	}

	@Override
	public List<CourseDto> getAllCourseDto() {
		return courseMapper.mapListEntityToListDto(courseRepository.findAll());
	}

	@Override
	public List<CourseDto> getCoursesByCategoryId(String categoryId) {
		return courseMapper.mapListEntityToListDto(courseRepository.getCourseByCategoryId(categoryId));
	}

	@Override
	public CourseEntity addCourse(CourseEntity courseEntity) {
		return courseRepository.save(courseEntity);
	}

	@Override
	public List<CourseEntity> getAllCourseEntity() {
		return courseRepository.findAll();
	}

	@Override
	public void updateCourseEntity(CourseEntity courseEntity) {
		courseRepository.save(courseEntity);
	}

	@Override
	public void removeCourseEntityById(String id) {
		courseRepository.deleteById(id);
	}
}
