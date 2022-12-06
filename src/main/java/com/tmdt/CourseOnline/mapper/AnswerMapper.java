package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import com.tmdt.CourseOnline.dto.AnswerDto;
import com.tmdt.CourseOnline.entity.AnswerEntity;

public class AnswerMapper {
	public AnswerDto mapEntityToDto(AnswerEntity answerEntity) {
		return new AnswerDto(
				answerEntity.getKey(), 
				answerEntity.getValue(), 
				answerEntity.isCorrect());
	}

	public List<AnswerDto> mapListEntityToListDto(List<AnswerEntity> answerEntities) {
		List<AnswerDto> answerDtos = new ArrayList<>();
		answerEntities.forEach(aw -> {answerDtos.add(mapEntityToDto(aw));});
		return answerDtos;
	}
}
