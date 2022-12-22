package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.LessonVideoEntity;

@Repository
public interface LessonVideoRepository extends JpaRepository<LessonVideoEntity, String>{

	@Query("select l from LessonVideoEntity l where l.chapter.id = ?1")
	public List<LessonVideoEntity> getLessonVideoEntitiesByChapterId(String chapterId);
	
}
