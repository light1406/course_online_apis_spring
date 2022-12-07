package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.EvaluationEntity;

@Repository
public interface EvaluationReponsitory extends JpaRepository<EvaluationEntity, String>{

}
