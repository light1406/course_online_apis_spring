package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String>{

}
