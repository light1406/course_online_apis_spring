package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.CommentDto;
import com.tmdt.CourseOnline.entity.CommentEntity;

public class CommentMapper {
	@Autowired
	private UserMapper userMapper;

//	public CommentDto mapEntityToDto(CommentEntity commentEntity) {
//		if (commentEntity.getReplies() == null)
//			return new CommentDto(commentEntity.getId(), commentEntity.getComment(), commentEntity.getTime(),
//					userMapper.mapEntityToDto(commentEntity.getUser()), null);
//		return new CommentDto(commentEntity.getId(), commentEntity.getComment(), commentEntity.getTime(),
//				userMapper.mapEntityToDto(commentEntity.getUser()), mapListEntityToListDto(commentEntity.getReplies()));
//	}
//
//	public List<CommentDto> mapListEntityToListDto(List<CommentEntity> commentEntities) {
//		List<CommentDto> commentDtos = new ArrayList<>();
//		commentEntities.forEach(cmt -> {
//			commentDtos.add(mapEntityToDto(cmt));
//		});
//		return commentDtos;
//	}
}
