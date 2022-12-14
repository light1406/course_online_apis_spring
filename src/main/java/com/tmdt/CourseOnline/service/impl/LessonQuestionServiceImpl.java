package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tmdt.CourseOnline.dto.LessonQuestionDto;
import com.tmdt.CourseOnline.entity.LessonQuestionEntity;
import com.tmdt.CourseOnline.mapper.LessonQuestionMapper;
import com.tmdt.CourseOnline.reponsitory.LessonQuestionRepository;
import com.tmdt.CourseOnline.service.LessonQuestionService;

@Service
public class LessonQuestionServiceImpl implements LessonQuestionService{

	@Autowired
	private LessonQuestionRepository lessonQuestionRepository;
	
	private LessonQuestionMapper lessonQuestionMapper = new LessonQuestionMapper(); 
	
	@Override
	public List<LessonQuestionDto> getLessonVideoDtoByChapterId(String chapterId){
		return lessonQuestionMapper.mapListEntityToListDto(
				lessonQuestionRepository.getAllByChapterId(chapterId));
	}
	
	@Override
	public void addLessonQuestion(@RequestBody LessonQuestionEntity lessonQuestionEntity) {
		lessonQuestionRepository.save(lessonQuestionEntity);
	}
	
	@Override
	public List<LessonQuestionEntity> getAll(){
		return lessonQuestionRepository.findAll();
	}
	
	
	@Override
	public List<LessonQuestionEntity> getAllByChapterId(String chapterId){
		return lessonQuestionRepository.getAllByChapterId(chapterId);
	}
	
	@Override
	public LessonQuestionEntity getLessonQuesionEntityById(String id) {
		return lessonQuestionRepository.findById(id).get();
	}
}
