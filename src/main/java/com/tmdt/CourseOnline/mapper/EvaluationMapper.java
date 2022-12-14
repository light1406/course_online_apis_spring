package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.EvaluationDto;
import com.tmdt.CourseOnline.entity.EvaluationEntity;

public class EvaluationMapper {

	private UserMapper userMapper = new UserMapper();
	
	public EvaluationDto mapEntityToDto(EvaluationEntity evaluationEntity) {
		return new EvaluationDto(
				evaluationEntity.getId(), 
				evaluationEntity.getScore(), 
				evaluationEntity.getComment(), 
				evaluationEntity.getTime(), 
				userMapper.mapEntityToDto(evaluationEntity.getUser()));
	}

	public List<EvaluationDto> mapListEntityToListDto(List<EvaluationEntity> evaluationEntities) {
		List<EvaluationDto> evaluationDtos = new ArrayList<>();
		evaluationEntities.forEach(eva -> {evaluationDtos.add(mapEntityToDto(eva));});
		return evaluationDtos;
	}
	
}
