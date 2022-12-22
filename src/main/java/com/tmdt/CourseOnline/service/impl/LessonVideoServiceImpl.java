package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.LessonVideoDto;
import com.tmdt.CourseOnline.entity.LessonVideoEntity;
import com.tmdt.CourseOnline.mapper.LessonVideoMapper;
import com.tmdt.CourseOnline.reponsitory.LessonVideoRepository;
import com.tmdt.CourseOnline.service.LessonVideoService;

@Service
public class LessonVideoServiceImpl implements LessonVideoService {

	@Autowired
	private LessonVideoRepository lessonVideoRepository;
	
	@Autowired
	private LessonVideoMapper lessonVideoMapper;

	@Override
	public List<LessonVideoDto> getLessonVideoDtoByChapterId(String chapterId){
		return lessonVideoMapper.mapListEntityToListDto(
				lessonVideoRepository.getLessonVideoEntitiesByChapterId(chapterId));
	}
	
	@Override
	public void addLessonVideo(LessonVideoEntity lessonVideoEntity) {
		lessonVideoRepository.save(lessonVideoEntity);
	}

	@Override
	public List<LessonVideoEntity> getAllEntity() {
		return lessonVideoRepository.findAll();
	}

	@Override
	public List<LessonVideoEntity> getEntityByChapterid(String ChapterId) {
		return lessonVideoRepository.getLessonVideoEntitiesByChapterId(ChapterId);
	}

	@Override
	public LessonVideoDto getById(String lessonId) {
		return lessonVideoMapper.mapEntityToDto(lessonVideoRepository.findById(lessonId).get());
	}
}
