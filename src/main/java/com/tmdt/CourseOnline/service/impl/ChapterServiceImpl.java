package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.ChapterDto;
import com.tmdt.CourseOnline.entity.ChapterEntity;
import com.tmdt.CourseOnline.mapper.ChapterMapper;
import com.tmdt.CourseOnline.reponsitory.ChapterRepository;
import com.tmdt.CourseOnline.service.ChapterService;

@Service
public class ChapterServiceImpl implements ChapterService {

	@Autowired
	private ChapterRepository chapterRepository;
	
	@Autowired
	private ChapterMapper chapterMapper;

	@Override
	public List<ChapterDto> getChapterDtoByCourseId(String courseId){
		return chapterMapper.mapListEntityToListDto(
						chapterRepository.getChaptersByCourseId(courseId));
	}
	
	@Override
	public List<ChapterEntity> getAllEntity() {
		return chapterRepository.findAll();
	}

	@Override
	public List<ChapterEntity> getEntityByCourseId(String courseId) {
		return chapterRepository.getChaptersByCourseId(courseId);
	}

	@Override
	public ChapterEntity getEntityById(String id) {
		return chapterRepository.findById(id).get();
	}

	@Override
	public void addChapter(ChapterEntity chapterEntity) {
		chapterRepository.save(chapterEntity);
	}

	@Override
	public void updateChapter(ChapterEntity chapterEntity) {
		chapterRepository.save(chapterEntity);
	}

	@Override
	public void deleteChapter(String id) {
		chapterRepository.deleteById(id);
	}
}
