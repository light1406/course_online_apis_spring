package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String>{

	@Query("select c from CourseEntity c where c.category.id = ?1")
	public List<CourseEntity> getCourseByCategoryId(String categoryId);
}
