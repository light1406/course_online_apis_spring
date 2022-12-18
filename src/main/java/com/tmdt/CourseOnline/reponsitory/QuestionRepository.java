package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.QuestionEntity;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, String>{
	
	@Query("select q from QuestionEntity q where q.lessonQuestion.id = ?1")
	public List<QuestionEntity> getAllByLQId(String lqId);
}
