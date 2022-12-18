package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.CategoryEntity;
import com.tmdt.CourseOnline.service.CategoryService;

@RestController
@RequestMapping("/tmdt/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/get-all")
	public List<CategoryEntity> getAllCategories() {
		return categoryService.getAllForEntity();
	}
	
	@GetMapping("/get-by-id")
	public CategoryEntity getCategoryById(@RequestParam String id) {
		return categoryService.getCategoryById(id);
	}

	@PostMapping("/add")
	public CategoryEntity addCategories(@RequestBody CategoryEntity categoryEntity) {
		return categoryService.addCategory(categoryEntity);
	}

	@PutMapping("/edit")
	public void updateCategory(@RequestBody CategoryEntity categoryEntity) {
		categoryService.updateCategory(categoryEntity);
	}
	
	@DeleteMapping("/delete")
	public void deleteCategory(@RequestParam String id) {
		categoryService.remove(id);
	}
}
