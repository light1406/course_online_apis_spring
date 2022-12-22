package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.CourseEntity;
import com.tmdt.CourseOnline.entity.UserEntity;

public interface UserService {

	UserDto getUserById(String id);

	UserEntity addUser(UserEntity userEntity);

	UserEntity addCourseToCourseOfUser(String userId, List<CourseEntity> courseEntities);

	void updateUser(UserEntity userEntity);

	UserEntity getUserEntityById(String id);

}
