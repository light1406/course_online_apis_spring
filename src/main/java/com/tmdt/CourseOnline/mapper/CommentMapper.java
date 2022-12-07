package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.CommentDto;
import com.tmdt.CourseOnline.entity.CommentEntity;

public class CommentMapper {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	public CommentDto mapEntityToDto(CommentEntity commentEntity) {
		return new CommentDto(
				commentEntity.getId(),
				commentEntity.getComment(),
				commentEntity.getTime(),
				userMapper.mapEntityToDto(commentEntity.getUser()),
				replyMapper.mapListEntityToListDto(commentEntity.getReplies()));
	}

	public List<CommentDto> mapListEntityToListDto(List<CommentEntity> commentEntities) {
		List<CommentDto> commentDtos = new ArrayList<>();
		commentEntities.forEach(cmt -> {commentDtos.add(mapEntityToDto(cmt));});
		return commentDtos;
	}
}
