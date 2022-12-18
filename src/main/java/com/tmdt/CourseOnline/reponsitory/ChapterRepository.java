package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.ChapterEntity;

@Repository
public interface ChapterRepository extends JpaRepository<ChapterEntity, String>{

	@Query("select chap from ChapterEntity chap where chap.course.id = ?1")
	public List<ChapterEntity> getChaptersByCourseId(String courseId);
}
