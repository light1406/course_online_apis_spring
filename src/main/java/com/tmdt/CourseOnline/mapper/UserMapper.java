package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.UserDto;
import com.tmdt.CourseOnline.entity.UserEntity;

public class UserMapper {
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private LessonQuestionMapper lessonQuestionMapper;
	
	@Autowired
	private LessonVideoMapper lessonVideoMapper;
	
//	public UserDto mapEntityToDto(UserEntity userEntity) {
//		return new UserDto(
//				userEntity.getId(), 
//				userEntity.getFname(), 
//				userEntity.getAvtUrl(), 
//				userEntity.getAge(), 
//				userEntity.getEmail(), 
//				userEntity.getPhone(), 
//				courseMapper.mapListEntityToListDto(userEntity.getCoursesOfUser()), 
//				lessonQuestionMapper.mapListEntityToListDto(userEntity.getLearnedLessonQuestions()), 
//				lessonVideoMapper.mapListEntityToListDto(userEntity.getLearnedLessonVideos()));
//	}
//
//	public List<UserDto> mapListEntityToListDto(List<UserEntity> userEntities) {
//		List<UserDto> userDtos = new ArrayList<>();
//		userEntities.forEach(u -> {userDtos.add(mapEntityToDto(u));});
//		return userDtos;
//	}
}
