package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.dto.OrderDto;
import com.tmdt.CourseOnline.entity.OrderEntity;
import com.tmdt.CourseOnline.service.OrderService;

@RestController
@RequestMapping("/tmdt/order")
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/add-order")
	public OrderDto addOrder(@RequestBody OrderEntity orderEntity) {
		return orderService.addOrder(orderEntity);
	}
	
	@GetMapping("/get-all-entity")
	public List<OrderEntity> getAllOrderEntity(){
		return orderService.getAllOrderEntity();
	}
	
	@PutMapping("/update-order")
	public void updateOrder(@RequestBody OrderEntity orderEntity) {
		orderService.updateOrder(orderEntity);
	}
	
	@GetMapping("/get-entity-by-id")
	public OrderEntity getOrderEntityById(String id) {
		return orderService.getOrderEntityById(id);
	}
	
	@GetMapping("/get-order-by-user-id")
	public List<OrderDto> getOrderByUserId(String userId){
		return orderService.getOrderByUserId(userId);
	}
}
