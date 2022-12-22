package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tmdt.CourseOnline.dto.CommentDto;
import com.tmdt.CourseOnline.entity.CommentEntity;
import com.tmdt.CourseOnline.service.CommentService;

public class CommentMapper {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private CommentService commentService;

	public CommentDto mapEntityToDto(CommentEntity commentEntity) {
		List<CommentEntity> replies = commentService.getReplies(commentEntity.getId());
		if (replies == null)
			return new CommentDto(commentEntity.getId(), commentEntity.getComment(), commentEntity.getTime(),
					userMapper.mapEntityToDto(commentEntity.getUser()), null);
		return new CommentDto(commentEntity.getId(), commentEntity.getComment(), commentEntity.getTime(),
				userMapper.mapEntityToDto(commentEntity.getUser()), mapListEntityToListDto(replies));
	}

	public List<CommentDto> mapListEntityToListDto(List<CommentEntity> commentEntities) {
		List<CommentDto> commentDtos = new ArrayList<>();
		commentEntities.forEach(cmt -> {
			commentDtos.add(mapEntityToDto(cmt));
		});
		return commentDtos;
	}
}
