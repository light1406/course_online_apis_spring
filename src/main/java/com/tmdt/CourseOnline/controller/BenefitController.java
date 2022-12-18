package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.entity.BenefitEntity;
import com.tmdt.CourseOnline.service.BenefitService;

@RestController
@RequestMapping("/tmdt/benefit")
@CrossOrigin("*")
public class BenefitController {

	@Autowired
	private BenefitService benefitService;
	
	@PostMapping("/add-list-benefit")
	public void addListBenefit(@RequestBody List<BenefitEntity> benefitEntities) {
		benefitService.addListBenefits(benefitEntities);
	}
	
	@GetMapping("/get-all-by-id")
	public List<BenefitEntity> getAllByCourseId(@RequestParam String id){
		return benefitService.getBenefitsByCourseId(id);
	}
}
