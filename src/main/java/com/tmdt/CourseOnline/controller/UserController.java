package com.tmdt.CourseOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.AccountEntity;
import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.entity.UserEntity;
import com.tmdt.CourseOnline.service.AccountService;
import com.tmdt.CourseOnline.service.UserService;

@RestController
@RequestMapping("/tmdt/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public UserEntity register(@RequestBody AccountEntity accountEntity) {
		boolean exists = accountService.getAccountByUserName(accountEntity.getUsername()) != null;
		if (exists) return null;
		UserEntity userEntity =  userService.addUser(accountEntity.getUser());
		accountService.addAccount(accountEntity);
		return userEntity;
	}
	
	@GetMapping("/get-user-by-id")
	public UserDto getUserById(String id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/login-customer")
	public UserDto loginCustomer(@RequestParam String username, @RequestParam String password) {
		return accountService.getUserByUserNamePassword(username, password);
	}
	
	@GetMapping("/login-admin")
	public UserDto loginAdmin(@RequestParam String username, @RequestParam String password) {
		return accountService.getAdminByUserNamePassword(username, password);
	}
	
	@PutMapping("/add-course-to-course-of-user")
	public void addCourseToCourseOfUser(@RequestParam String userId, @RequestBody List<CourseEntity> courseEntities) {
		userService.addCourseToCourseOfUser(userId, courseEntities);
	}
	
	@GetMapping("/get-user-entity-by-id")
	public UserEntity getUserEntityById(@RequestParam String id) {
		return userService.getUserEntityById(id);
	}
	
	@PutMapping("/update-user")
	public void updateUser(@RequestBody UserEntity userEntity) {
		userService.updateUser(userEntity);
	}
}
