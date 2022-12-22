package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.EvaluationDto;
import com.tmdt.CourseOnline.mapper.EvaluationMapper;
import com.tmdt.CourseOnline.reponsitory.EvaluationReponsitory;
import com.tmdt.CourseOnline.service.EvaluationService;

@Service
public class EvaluationServiceImpl implements EvaluationService{

	@Autowired
	private EvaluationReponsitory evaluationReponsitory;
	
	private EvaluationMapper evaluationMapper = new EvaluationMapper();
	
	@Override
	public List<EvaluationDto> getEvaluationDtoByCourseId(String courseId){
		return evaluationMapper.mapListEntityToListDto(
				evaluationReponsitory.getEvaluationEntitiesByCourseId(courseId));
	}
}
