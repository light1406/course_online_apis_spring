package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.AnswerEntity;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, String>{
	
	@Query("select a from AnswerEntity a where a.question.id = ?1")
	public List<AnswerEntity> getAllByQuestionId(String questionId);
}
