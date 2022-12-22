package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String>{
	
	@Query("select o from OrderEntity o where o.user.id = ?1")
	public List<OrderEntity> getOrderByUserId(String userId);
}
