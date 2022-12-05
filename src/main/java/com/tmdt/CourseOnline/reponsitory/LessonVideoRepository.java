package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.LessonVideoEntity;

@Repository
public interface LessonVideoRepository extends JpaRepository<LessonVideoEntity, String>{

}
