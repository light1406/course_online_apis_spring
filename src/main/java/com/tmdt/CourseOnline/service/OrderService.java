package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.OrderDto;
import com.tmdt.CourseOnline.entity.OrderEntity;

public interface OrderService {

	OrderDto addOrder(OrderEntity orderEntity);

	List<OrderDto> getOrderByUserId(String userId);

	List<OrderEntity> getAllOrderEntity();

	void updateOrder(OrderEntity orderEntity);

	OrderEntity getOrderEntityById(String id);

}
