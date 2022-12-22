package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.EvaluationDto;

public interface EvaluationService {

	List<EvaluationDto> getEvaluationDtoByCourseId(String courseId);

}
