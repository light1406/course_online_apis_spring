package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.entity.CategoryEntity;

public interface CategoryService {

	void updateCategory(CategoryEntity categoryEntity);

	void remove(String id);

	CategoryEntity addCategory(CategoryEntity categoryEntity);

	List<CategoryEntity> getAllForEntity();

	CategoryEntity getCategoryById(String id);

}
