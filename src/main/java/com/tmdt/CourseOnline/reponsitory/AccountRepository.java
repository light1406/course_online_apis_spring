package com.tmdt.CourseOnline.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.AccountEntity;
import com.tmdt.CourseOnline.entity.UserEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String>{
	
	@Query("select acc.user from AccountEntity acc where acc.username = ?1 and acc.password = ?2 and acc.role = 0")
	public UserEntity getUserByUserNamePassword(String username, String password);
	
	@Query("select acc.user from AccountEntity acc where acc.username = ?1 and acc.password = ?2 and acc.role = 1")
	public UserEntity getAdminByUserNamePassword(String username, String password);
}
