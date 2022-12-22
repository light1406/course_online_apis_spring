package com.tmdt.CourseOnline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmdt.CourseOnline.dto.CommentDto;
import com.tmdt.CourseOnline.entity.CommentEntity;
import com.tmdt.CourseOnline.mapper.CommentMapper;
import com.tmdt.CourseOnline.reponsitory.CommentRepository;
import com.tmdt.CourseOnline.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	private CommentMapper commentMapper = new CommentMapper();
	
	@Override
	public List<CommentDto> getCommentDtoByLvdId(String lvdId){
		return commentMapper.mapListEntityToListDto(
				commentRepository.getCommentEntityByLvdId(lvdId));
	}
	
	@Override
	public List<CommentEntity> getReplies(String commentId){
		return commentRepository.getRepliesByCommentId(commentId);
	}
	
}
