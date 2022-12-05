package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.ChapterEntity;

@Repository
public interface ChapterRepository extends JpaRepository<ChapterEntity, String>{

}
