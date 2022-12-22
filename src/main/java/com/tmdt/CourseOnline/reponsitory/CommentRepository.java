package com.tmdt.CourseOnline.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tmdt.CourseOnline.entity.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, String>{
	
	@Query("select cmt from CommentEntity cmt where cmt.lessonVideo.id = ?1")
	public List<CommentEntity> getCommentEntityByLvdId(String lvId);
	
	@Query("select cmt from CommentEntity cmt where cmt.commentForReply.id = ?1")
	public List<CommentEntity> getRepliesByCommentId(String cmtId);
}
