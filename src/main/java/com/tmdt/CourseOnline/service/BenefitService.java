package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.entity.BenefitEntity;

public interface BenefitService {

	BenefitEntity addBenefit(BenefitEntity benefitEntity);

	List<BenefitEntity> getBenefitsByCourseId(String id);

	void addListBenefits(List<BenefitEntity> benefitEntities);

}
