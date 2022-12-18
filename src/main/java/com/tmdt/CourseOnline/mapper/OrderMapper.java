package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.OrderDto;
import com.tmdt.CourseOnline.entity.OrderEntity;

public class OrderMapper {
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private UserMapper userMapper;
	
//	public OrderDto mapEntityToDto(OrderEntity orderEntity) {
//		return new OrderDto(
//				orderEntity.getId(), 
//				userMapper.mapEntityToDto(orderEntity.getUser()), 
//				courseMapper.mapListEntityToListDto(orderEntity.getCourses()), 
//				orderEntity.getStatus(), 
//				orderEntity.getPurchaseDate());
//	}

//	public List<OrderDto> mapListEntityToListDto(List<OrderEntity> orderEntities) {
//		List<OrderDto> orderDtos = new ArrayList<>();
//		orderEntities.forEach(o -> {orderDtos.add(mapEntityToDto(o));});
//		return orderDtos;
//	}
}
