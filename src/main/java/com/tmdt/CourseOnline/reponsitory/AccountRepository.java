package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String>{
}
