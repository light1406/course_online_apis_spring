package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.entity.UserEntity;
import com.tmdt.CourseOnline.mapper.UserMapper;
import com.tmdt.CourseOnline.reponsitory.UserRepository;
import com.tmdt.CourseOnline.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto getUserById(String id) {
		return userMapper.mapEntityToDto(userRepository.findById(id).get());
	}

	@Override
	public UserEntity addUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity addCourseToCourseOfUser(String userId, List<CourseEntity> courseEntities) {
		UserEntity userEntity = userRepository.findById(userId).get();
		List<CourseEntity> courseOfUser = userEntity.getCoursesOfUser();
		courseOfUser.addAll(courseEntities);
		userEntity.setCoursesOfUser(courseOfUser);
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity getUserEntityById(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void updateUser(UserEntity userEntity) {
		userRepository.save(userEntity);
	}
}
