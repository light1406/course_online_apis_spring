package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.BenefitEntity;

@Repository
public interface BenefitRepository extends JpaRepository<BenefitEntity, String>{

}
