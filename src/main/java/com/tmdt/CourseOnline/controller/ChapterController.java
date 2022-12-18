package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.ChapterEntity;
import com.tmdt.CourseOnline.service.ChapterService;

@RestController
@RequestMapping("/tmdt/chapter")
@CrossOrigin("*")
public class ChapterController {

	@Autowired
	private ChapterService chapterService;
	
	@GetMapping("/get-all-admin")
	public List<ChapterEntity> getAllChapterAdmin(){
		return chapterService.getAllEntity();
	}
	
	@GetMapping("/get-by-course-id")
	public List<ChapterEntity> getChaptersByCourseId(@RequestParam String courseId) {
		return chapterService.getEntityByCourseId(courseId);
	}
	
	@GetMapping("/get-by-id")
	public ChapterEntity getChapterById(@RequestParam String id) {
		return chapterService.getEntityById(id);
	}
	
	@PostMapping("/add")
	public void addChapter(@RequestBody ChapterEntity chapterEntity) {
		chapterService.addChapter(chapterEntity);
	}
	
	@PutMapping("/edit")
	public void updateChapter(@RequestBody ChapterEntity chapterEntity) {
		chapterService.updateChapter(chapterEntity);
	}
	
	@DeleteMapping("/delete")
	public void deleteChapter(@RequestParam String id) {
		chapterService.deleteChapter(id);
	}
}
