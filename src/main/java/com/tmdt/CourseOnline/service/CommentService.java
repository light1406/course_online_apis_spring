package com.tmdt.CourseOnline.service;

import java.util.List;

import com.tmdt.CourseOnline.dto.CommentDto;
import com.tmdt.CourseOnline.entity.CommentEntity;

public interface CommentService {

	List<CommentEntity> getReplies(String commentId);

	List<CommentDto> getCommentDtoByLvdId(String lvdId);

}
