package com.tmdt.CourseOnline.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmdt.CourseOnline.dto.ReplyDto;
import com.tmdt.CourseOnline.entity.ReplyEntity;

public class ReplyMapper {
	@Autowired
	private UserMapper userMapper;
	
	public ReplyDto mapEntityToDto(ReplyEntity replyEntity) {
		return new ReplyDto(
				replyEntity.getId(),
				replyEntity.getComment(),
				replyEntity.getTime(),
				userMapper.mapEntityToDto(replyEntity.getUser()));
	}

	public List<ReplyDto> mapListEntityToListDto(List<ReplyEntity> replyEntities) {
		List<ReplyDto> replyDtos = new ArrayList<>();
		replyEntities.forEach(rep -> {replyDtos.add(mapEntityToDto(rep));});
		return replyDtos;
	}
}
