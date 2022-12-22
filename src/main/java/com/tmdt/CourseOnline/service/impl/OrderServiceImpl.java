package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.OrderDto;
import com.tmdt.CourseOnline.entity.OrderEntity;
import com.tmdt.CourseOnline.mapper.OrderMapper;
import com.tmdt.CourseOnline.reponsitory.OrderRepository;
import com.tmdt.CourseOnline.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public OrderDto addOrder(OrderEntity orderEntity) {
		return orderMapper.mapEntityToDto(orderRepository.save(orderEntity));
	}

	@Override
	public List<OrderEntity> getAllOrderEntity() {
		return orderRepository.findAll();
	}

	@Override
	public List<OrderDto> getOrderByUserId(String userId) {
		return orderMapper.mapListEntityToListDto(orderRepository.getOrderByUserId(userId));
	}

	@Override
	public void updateOrder(OrderEntity orderEntity) {
		orderRepository.save(orderEntity);
	}
	
	@Override
	public OrderEntity getOrderEntityById(String id) {
		return orderRepository.findById(id).get();
	}
}
