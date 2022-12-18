package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.entity.BenefitEntity;
import com.tmdt.CourseOnline.reponsitory.BenefitRepository;
import com.tmdt.CourseOnline.service.BenefitService;

@Service
public class BenefitServiceImpl implements BenefitService{
	
	@Autowired
	private BenefitRepository benefitRepository;
	
	@Override
	public List<BenefitEntity> getBenefitsByCourseId(String id) {
		return benefitRepository.findAll();
	}
	
	@Override
	public BenefitEntity addBenefit(BenefitEntity benefitEntity) {
		return benefitRepository.save(benefitEntity);
	}
	
	@Override
	public void addListBenefits(List<BenefitEntity> benefitEntities) {
		benefitEntities.forEach(b -> {benefitRepository.save(b);});
	}
}
