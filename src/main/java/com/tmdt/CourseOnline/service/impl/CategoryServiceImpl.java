package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.entity.CategoryEntity;
import com.tmdt.CourseOnline.reponsitory.CategoryRepository;
import com.tmdt.CourseOnline.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoryEntity> getAllForEntity() {
		return categoryRepository.findAll();
	}

	@Override
	public CategoryEntity getCategoryById(String id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public CategoryEntity addCategory(CategoryEntity categoryEntity) {
		return categoryRepository.save(categoryEntity);
	}

	@Override
	public void remove(String id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public void updateCategory(CategoryEntity categoryEntity) {
		categoryRepository.save(categoryEntity);
	}
}
