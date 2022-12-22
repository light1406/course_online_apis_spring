package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.AnswerDto;
import com.tmdt.CourseOnline.entity.AnswerEntity;
import com.tmdt.CourseOnline.mapper.AnswerMapper;
import com.tmdt.CourseOnline.reponsitory.AnswerRepository;
import com.tmdt.CourseOnline.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepository;
	
	private AnswerMapper answerMapper = new AnswerMapper();
	
	@Override
	public List<AnswerDto> getDtoByQuestionId(String questionId){
		return answerMapper.mapListEntityToListDto(answerRepository.getAllByQuestionId(questionId));
	}
	
	@Override
	public void addListAnswer(List<AnswerEntity> answerEntities) {
		answerEntities.forEach(an -> {answerRepository.save(an);});
	}
	
	@Override
	public List<AnswerEntity> getAllEntityByQuestionId(String questionId){
		return answerRepository.getAllByQuestionId(questionId);
	}
}
