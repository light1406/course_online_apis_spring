package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.EvaluationEntity;

@Repository
public interface EvaluationReponsitory extends JpaRepository<EvaluationEntity, String>{

	@Query("select eva from EvaluationEntity eva where eva.course.id = ?1")
	public List<EvaluationEntity> getEvaluationEntitiesByCourseId(String courseId);
	
}
