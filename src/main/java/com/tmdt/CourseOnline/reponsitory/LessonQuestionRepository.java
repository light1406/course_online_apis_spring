package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.LessonQuestionEntity;

@Repository
public interface LessonQuestionRepository extends JpaRepository<LessonQuestionEntity, String>{
	
	@Query("select l from LessonQuestionEntity l where l.chapter.id = ?1")
	public List<LessonQuestionEntity> getAllByChapterId(String chapterId);
}
