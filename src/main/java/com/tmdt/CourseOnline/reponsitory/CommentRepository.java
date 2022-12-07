package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, String>{

}
