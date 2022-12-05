package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.LessonQuestionEntity;

@Repository
public interface LessonQuestionRepository extends JpaRepository<LessonQuestionEntity, String>{

}
